package com.testcode.BusinessLogic;
import java.util.Scanner;
import javax.swing.JFrame;


public class AvgSpeedCalculator {


    double time;
    double distance;
    double avspeed;
    double fuelconsumption = 5.2;

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getAvspeed() {
        return avspeed;
    }

    public void setAvspeed(double avspeed) {
        this.avspeed = avspeed;
    }

    public double getFuelconsumption() {
        return fuelconsumption;
    }

    public void setFuelconsumption(double fuelconsumption) {
        this.fuelconsumption = fuelconsumption;
    }


    public double getAvgSpeed(double distance,
                              double time) {

        this.avspeed = distance / time;

        return avspeed;
    }




}
