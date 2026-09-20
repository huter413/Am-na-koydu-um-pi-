package com.sirin5dwaves.client;
public final class WaveMath { private WaveMath() {} public static float height(double x,double z,double t){return (float)(Math.sin(x*.42+t*1.65)*.22+Math.sin(z*.31-t*1.15)*.16+Math.sin((x+z)*.19+t*.72)*.11+Math.sin(Math.hypot(x,z)*.55-t*1.35)*.08);}}
