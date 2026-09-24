package com.renhejia.robot.commandlib;

import com.google.gson.Gson;
import com.renhejia.robot.commandlib.parser.antennalight.AntennaLight;
import com.renhejia.robot.commandlib.parser.antennamotion.AntennaMotion;
import com.renhejia.robot.commandlib.parser.motion.Motion;
import com.renhejia.robot.commandlib.parser.power.PowerMotion;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * GeeUIMcuService parses these strings with Gson. Power, ears and LED must
 * stay JSON. Motion stays the legacy single-quoted form: a null name is the
 * literal "null", which the MCU service treats as "pose by id".
 */
public class McuPayloadContractTest {

    private final Gson gson = new Gson();

    @Test
    public void powerMotionSleepAndRobotModeRoundTrip() {
        PowerMotion sleepServos = gson.fromJson(new PowerMotion(3, 0).toString(), PowerMotion.class);
        PowerMotion sleepPolicy = gson.fromJson(new PowerMotion(5, 0).toString(), PowerMotion.class);
        PowerMotion robotServos = gson.fromJson(new PowerMotion(3, 1).toString(), PowerMotion.class);
        PowerMotion robotPolicy = gson.fromJson(new PowerMotion(5, 1).toString(), PowerMotion.class);

        assertEquals(3, sleepServos.getFunction());
        assertEquals(0, sleepServos.getStatus());
        assertEquals(5, sleepPolicy.getFunction());
        assertEquals(0, sleepPolicy.getStatus());
        assertEquals(3, robotServos.getFunction());
        assertEquals(1, robotServos.getStatus());
        assertEquals(5, robotPolicy.getFunction());
        assertEquals(1, robotPolicy.getStatus());
    }

    @Test
    public void antennaMotionRoundTripsFourEarFields() {
        AntennaMotion ears = new AntennaMotion(3, 2, 300);
        ears.setAngle(90);

        AntennaMotion parsed = gson.fromJson(ears.toString(), AntennaMotion.class);

        assertEquals(3, parsed.getCmd());
        assertEquals(2, parsed.getStep());
        assertEquals(300, parsed.getSpeed());
        assertEquals(90, parsed.getAngle());
    }

    @Test
    public void antennaLightRoundTripsOnAndColor() {
        AntennaLight light = new AntennaLight("on", 2);

        AntennaLight parsed = gson.fromJson(light.toString(), AntennaLight.class);

        assertEquals("on", parsed.getAntenna_light());
        assertEquals(2, parsed.getAntenna_light_color());
    }

    @Test
    public void nullMotionNameIsPoseByIdForTheMcu() {
        String raw = new Motion(null, 63, 3).toString();

        assertTrue(raw.contains("motion:'null'"));
        assertTrue(raw.contains("number:63"));
        assertTrue(raw.contains("stepNum:3"));
    }
}
