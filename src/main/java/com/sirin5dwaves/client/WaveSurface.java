package com.sirin5dwaves.client;

import com.sirin5dwaves.config.WaveConfig;

public final class WaveSurface {
    private WaveSurface(){}
    public static float sample(double x,double z,double gameTime){
        return WaveProfile.height(x,z,gameTime*WaveConfig.TIME_SCALE);
    }
    public static boolean isWithinRenderDistance(double dx,double dz){
        double r=WaveConfig.RENDER_RADIUS+.5;
        return dx*dx+dz*dz<=r*r;
    }
}
