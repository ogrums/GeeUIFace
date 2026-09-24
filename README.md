# GeeUIFace

Application **visage / expression** du robot Letianpai (ROM GeeUI, Android 11).

Elle affiche les expressions en plein écran (vidéos MP4), orchestre les **gestes** (corps, oreilles, lumières d’antenne, sons) et parle aux autres apps système via AIDL.

Fork modernisé : branche [`android11-modernize`](https://github.com/ogrums/GeeUIFace/tree/android11-modernize) — toolchain 2026, **minSdk 30**. Détail dans [MIGRATION-ANDROID11.md](MIGRATION-ANDROID11.md).

> Upstream : [Letianpai-Robot/GeeUIFace](https://github.com/Letianpai-Robot/GeeUIFace)

---

## Rôle dans le robot

GeeUIFace n’est pas un launcher. C’est l’écran « tête » :

| Couche | Rôle |
|---|---|
| **MainActivity** | Lecture en boucle d’une expression (`assets/video/hxxxx.mp4`) en fullscreen, **Media3 ExoPlayer** |
| **AutoService** | Machine à états des poses (mode robot, recherche de personnes, sommeil…) |
| **ILetianpaiService** | Bus AIDL vers `com.renhejia.robot.letianpaiservice` (MCU, audio, TTS, speech, apps) |

Un `GestureData` combine en une pose :

- expression (id `h00xx` → fichier vidéo)
- mouvement des pieds (`Motion`)
- oreilles / antennes (`AntennaMotion`)
- lumière d’antenne (`AntennaLight`)
- effet sonore (`Sound`, joué par AudioService)
- TTS optionnel

---

## Fonctionnalités

### Expressions

- ~297 clips MP4 dans `app/src/main/assets/video/` (`h0001` …).
- Changement d’expression :
  - extra d’intent `face` (défaut `h0059`)
  - callback AIDL `LtpExpressionCallback`
  - pose en cours dans AutoService
- Écran always-on, barre de statut / navigation masquées.
- Activité de debug : `ExoplayerActivity` (non exportée). Le player de prod est Media3 (`androidx.media3` 1.5.1), plus IJK 0.8.8 ni ExoPlayer 2.x.

### Modes robot

Extra d’intent `mode`, ou commande AIDL `setAppCmd`. Modes utilisés ici :

| Mode | Comportement |
|---|---|
| `robot` | Auto-mode : cycle de poses (A→B→C→D→aléatoire) + recherche de visages périodique |
| `sleep` | Coupure couple moteurs (`PowerMotion` 3/5 = 0) |
| `static` / `demo` | Pas de cycle automatique |
| `exit` | Arrêt des poses, kill process si demandé |

Autres modes définis dans CommandLib (`speech`, `24hour`, `hand`, `face`, `photo`…) — le launcher / LetianpaiService les dispatchent ; GeeUIFace réagit surtout à `robot` / `sleep` / `exit`.

### Gestes (AutoService)

Séquence type en mode `robot` :

1. **A — standby** : expression `h0063`, petit mouvement, son court  
2. **Recherche de personnes** : lance `com.ltp.ident` (IdentFaceService), expressions « cherche »  
3. **Résultat** : pose « trouvé » / « pas trouvé » (`GestureCenter.foundPeoGestureData` / `foundNoPeoGestureData`)  
4. **B / C / D** : enchaînements plus longs (marche, oreilles, lumières)  
5. **Bibliothèque aléatoire** : `GestureCenter.getRandomGesture()`  
6. Toutes les 5 poses : nouvelle passe de reconnaissance faciale  

Autres déclencheurs cloud (long-connect) :

- `selfIntroduction` → gestes YouPin (`youPinGestures`)
- `deviceRemoteMsgPush` / `remoteStroll` → config `remote_stroll` via API GeeUI

### Reconnaissance faciale

App système `com.ltp.ident` / `IdentFaceService`. Paramètres : seuil 0.32, max 20 détections, timeout 45 s. Résultat JSON (`IdentFaceModel` : `faceNumber`, `isOwner`, `areaPercent`).

### Commandes MCU / audio

Via `ILetianpaiService` :

- `setMcuCommand` — marche, rotation, couple moteurs, oreilles, lumières
- `setAudioEffect` — sons `a0xxx` (AudioService)
- `setTTS` — synthèse vocale (Launcher)
- `setSpeechCmd` — ex. `COMMAND_SEARCH_PEOPLE`
- `setAppCmd` — kill process, changement de mode, sommeil

---

## Architecture

```
GeeUIFace (:app)
 ├── GeeUIBase/CommandLib      constantes + parsers JSON des commandes
 ├── GeeUIBase/GestureFactory  bibliothèque de GestureData
 ├── GeeUIBase/library         SPH serial (inclus, non lié à :app)
 └── GeeUIComponets
      ├── Components           réseau GeeUI (OkHttp), logs xlog, Picasso
      └── CommChannel          AIDL ILetianpaiService (copie locale aussi dans :app)
```

Sur ce fork, **GeeUIBase** et **GeeUIComponets** sont vendored (plus de `git submodule update`). Le `settings.gradle` pointe vers `GeeUIComponets/` (typo d’origine conservée).

Processus système attendus sur le robot :

| Package | Rôle |
|---|---|
| `com.renhejia.robot.letianpaiservice` | Bus AIDL (action `android.intent.action.LETIANPAI`) |
| `com.ltp.ident` | Reconnaissance faciale |
| Letianpai MCU / Audio services | Moteurs, oreilles, FX audio |
| Launcher | TTS, dispatch des modes |

Sans ces services, l’app peut afficher une expression mais les poses MCU / sons ne partent pas.

---

## Dépendances

### Gradle (module `:app`)

| Artefact | Version | Usage |
|---|---|---|
| `androidx.core:core-ktx` | 1.15.0 | Kotlin Android |
| `androidx.appcompat:appcompat` | 1.7.0 | `AppCompatActivity` |
| `com.google.android.material:material` | 1.12.0 | Thème Material |
| `androidx.constraintlayout:constraintlayout` | 2.2.1 | Layout |
| `androidx.media3:media3-exoplayer` / `media3-ui` | 1.5.1 | Lecture des expressions (`asset:///video/hxxxx.mp4`), boucle native |
| `com.google.code.gson:gson` | 2.11.0 | JSON (faces, config cloud, gestures) |

Projets locaux : `:CommandLib`, `:GestureFactory`, `:Components`.

### Transitives (via Components / CommandLib)

| Artefact | Version | Usage |
|---|---|---|
| `com.squareup.okhttp3:okhttp` | 4.12.0 | API GeeUI (`GeeUiNetManager`) |
| `com.squareup.okio:okio` | 3.9.1 | I/O OkHttp |
| `com.elvishew:xlog` | 1.10.1 | Logs |
| `com.squareup.picasso:picasso` | 2.8 | Images (Components) |
| `com.google.zxing:core` | 3.4.1 | QR (Components, exclude partielle) |

Catalog : [`gradle/libs.versions.toml`](gradle/libs.versions.toml) (référence ; les `build.gradle` pinent encore les versions en dur).

### Toolchain (branche `android11-modernize`)

| | |
|---|---|
| AGP / Gradle | 8.13.0 / 8.13 |
| Kotlin | 2.0.21 |
| JDK | 17 |
| compileSdk / targetSdk | 36 |
| **minSdk** | **30 (Android 11)** |
| Repos Maven | Google, Maven Central, JitPack |

---

## Lancer / extras d’intent

Launcher par défaut : `com.geeui.face.MainActivity`.

```text
face   → id d’expression sans extension  (ex. h0059)
mode   → robot | sleep | static | demo | …
```

`onNewIntent` accepte un nouveau `face` / `mode` sans recréer l’activité.

---

## Build

Prérequis : JDK 17, Android SDK 36, Android Studio Ladybug+ (ou `./gradlew`).

```bash
git clone https://github.com/ogrums/GeeUIFace.git
cd GeeUIFace
git checkout android11-modernize
./gradlew :app:assembleDebug
```

APK : `app/build/outputs/apk/debug/`. Signé avec le keystore du projet (`app/letianpai.jks`) — nécessaire pour une app système sur la ROM GeeUI.

Sur le robot, installer en app système (même signature que le firmware) pour AIDL / permissions `WRITE_SETTINGS` / stockage.

---

## Structure source (`:app`)

```
app/src/main/java/com/geeui/face/
  MainActivity.kt              player Media3 + bind AutoService
  ExoplayerActivity.kt         debug Media3 (non exportée)
  service/AutoService.kt       FSM poses + AIDL + ident
  gesture/                     exécution séquentielle des GestureData
  broadcast/                   Wi‑Fi / timer (peu utilisés par le flux principal)
  model/IdentFaceModel.kt      JSON ident
  consts/RGestureConsts.java   ids de tâches de geste
app/src/main/aidl/             miroir ILetianpaiService
app/src/main/assets/video/     expressions MP4
```

---

## Licence

[GNU GPL v2](LICENSE.txt)

---

## Contribuer

1. Tester et ouvrir une issue si quelque chose manque.
2. Corriger un bug existant.
3. Proposer une pose / un bloc d’expression.

Commit + pull request, avec une courte description et un test sur robot (ou émulateur API 30). Garder les noms (`h00xx`, commandes MCU) cohérents avec LetianpaiService / MCU.
