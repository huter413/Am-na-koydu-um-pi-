package com.sirin5dwaves.client;

import net.minecraft.world.entity.Entity;

public final class WavePhysics {
    private WavePhysics(){}
    public static float sampleLift(double x,double z,double time){
        return WaveProfile.height(x,z,time);
    }
    public static void applyVisualBuoyancy(Entity entity,double x,double z,double time){
        // Reserved for collision/boat buoyancy; renderer does not alter vanilla physics.
    }
}
