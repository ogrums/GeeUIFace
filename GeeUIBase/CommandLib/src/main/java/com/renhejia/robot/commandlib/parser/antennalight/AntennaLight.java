package com.renhejia.robot.commandlib.parser.antennalight;

public class AntennaLight {
    private String antenna_light;
    private int antenna_light_color;

    /**
     * 1: 红色-red
     * 2: 绿色-green
     * 3: 蓝色-blue
     * 4: 橙色-orange
     * 5: 白色-white
     * 6: 黄色-yellow
     * 7: 紫色-purple
     * 8: 青色-cyan
     * 9: 黑色-black
     */
    public AntennaLight(String light, int color) {
        this.antenna_light = light;
        this.antenna_light_color = color;
    }

    public int getAntenna_light_color() {
        return antenna_light_color;
    }

    public void setAntenna_light_color(int antenna_light_color) {
        this.antenna_light_color = antenna_light_color;
    }

    public String getAntenna_light() {
        return antenna_light;
    }

    public void setAntenna_light(String antenna_light) {
        this.antenna_light = antenna_light;
    }

    @Override
    public String toString() {


        return "{" +
                '\"' + "antenna_light" + '\"' + ":" + '\"' + antenna_light + '\"' +
                "," + '\"' + "antenna_light_color" + '\"' + ":" + antenna_light_color +
                '}';

    }

}
