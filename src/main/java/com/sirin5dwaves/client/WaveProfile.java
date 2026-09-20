package com.sirin5dwaves.client;

public final class WaveProfile {
    private WaveProfile(){}
    public static float height(double x,double z,double time){
        double a=Math.sin(x*.105+time*.72)*.46;
        double b=Math.sin(z*.135-time*.91)*.34;
        double c=Math.sin((x+z)*.071+time*.51)*.24;
        double d=Math.sin(Math.hypot(x,z)*.19-time*1.05)*.18;
        return (float)((a+b+c+d)*2.0);
    }
}
