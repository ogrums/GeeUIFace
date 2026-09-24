package com.renhejia.robot.commandlib.parser.geeuiface;

/**
 *
 *
 * @author liujunbin
 */
public class RobotMode {
    private String mode;
    private String face;

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    @Override
    public String toString() {
        return "{" +
                "mode:'" + mode + '\'' +
                ", face:'" + face + '\'' +
                '}';
    }
}
