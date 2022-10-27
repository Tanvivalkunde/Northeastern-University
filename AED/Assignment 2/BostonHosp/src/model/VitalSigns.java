/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Tanvi
 */
public class VitalSigns {
    int lowerBloodPressure;
    int upperBloodPressure;
    float bodyTemperature;
    int pulseRate;
    int respirationRate;

    public VitalSigns(int lowerBloodPressure, int upperBloodPressure, float bodyTemperature, int pulseRate, int respirationRate) {
        this.lowerBloodPressure = lowerBloodPressure;
        this.upperBloodPressure = upperBloodPressure;
        this.bodyTemperature = bodyTemperature;
        this.pulseRate = pulseRate;
        this.respirationRate = respirationRate;
        
        
    }

    public int getLowerBloodPressure() {
        return lowerBloodPressure;
    }

    public void setLowerBloodPressure(int lowerBloodPressure) {
        this.lowerBloodPressure = lowerBloodPressure;
    }

    public int getUpperBloodPressure() {
        return upperBloodPressure;
    }

    public void setUpperBloodPressure(int upperBloodPressure) {
        this.upperBloodPressure = upperBloodPressure;
    }

    public float getBodyTemperature() {
        return bodyTemperature;
    }

    public void setBodyTemperature(float bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }

    public int getPulseRate() {
        return pulseRate;
    }

    public void setPulseRate(int pulseRate) {
        this.pulseRate = pulseRate;
    }

    public int getRespirationRate() {
        return respirationRate;
    }

    public void setRespirationRate(int respirationRate) {
        this.respirationRate = respirationRate;
    }
}

