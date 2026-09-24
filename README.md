# GeeUIFace

Full-screen face. It plays an expression video and runs gesture scripts (face, feet, ears, antenna light, sound).

## Package

- `com.geeui.face`
- `MainActivity` is `MAIN` / `LAUNCHER`
- Local service: `AutoService`

## What it does

`MainActivity` reads extras `mode` and `face`. The default face id is `h0059`. It hides the status bar, binds `AutoService`, and loops the expression on an `IjkMediaPlayer` surface. Video and audio use hardware decode. `changeFace` swaps the file. A commented note says that if the new name equals the current name, do not switch yet.

`ContentProviderQuery` loads the file from `content://com.letianpai.robot.resources.provider/expression` (`fileName`, `filePath`, `fileTag`, `defaultPath`). That provider is the resources app, not this one.

`AutoService` binds `ILetianpaiService` and runs gesture scripts: default pose, person search, and behaviors labeled A, B, C, and D. It can also start or stop face identification (`com.ltp.ident` / `IdentFaceService`).

`AudioCmdResponseManager.responseGestureData` splits one gesture across three responders. The comments say the responder for each part lives in the launcher, the MCU service, or the audio service. A motion value of `0` stops the current motion immediately. Antenna commands are separate from foot motion.

`ExoplayerActivity` and `IJkplayerActivity` exist. Their launcher filters are commented out.

Submodules: `GeeUIBase` (`CommandLib`, `library`, `GestureFactory`) and `GeeUIComponets` (`CommChannel`, `Components`).

## Comment glossary

| Where | Chinese | English |
|---|---|---|
| `RGestureConsts` | 姿态标签常量；默认姿态；找人动作；C类行为；D类行为 | Gesture tags; default pose; person-search; type C; type D |
| `AudioCmdResponseManager` | 语音命令执行单元 | Voice-command execution unit |
| `AudioCmdResponseManager` | 响应单元在Launcher / MCUservice / AudioService | Responder is the launcher / MCU service / audio service |
| `AudioCmdResponseManager` | 0会立即停止当前的动作；天线 | 0 stops the current motion immediately; antenna |
| `AutoService` | 默认姿态；A类行为；找人行为 | Default pose; type-A behavior; person search |
| `MainActivity` | 隐藏状态栏（通知栏） | Hide the status bar |
| `MainActivity` | 视频硬件解码；音频硬件解码；设置跳帧 | Hardware video decode; hardware audio decode; frame skip |
| `MainActivity` | 名字相同，暂不用切换新的表情 | Same name; do not switch expression yet |
