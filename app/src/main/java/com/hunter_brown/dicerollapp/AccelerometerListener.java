package com.hunter_brown.dicerollapp;

public interface AccelerometerListener {
    void onAccelerationChanged(float x, float y, float z);

    void onShake(float force);

}
