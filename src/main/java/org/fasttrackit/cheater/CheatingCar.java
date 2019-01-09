package org.fasttrackit.cheater;

import org.fasttrackit.AutoVehicle;
import org.fasttrackit.Vehicle;

public class CheatingCar extends Vehicle {

    public double accelerate (double speed, double durationInHours){
        System.out.println( getName() + " accelerated with " + speed + " km/h  for " + durationInHours + " hours.");
        double distance =2*speed * durationInHours;
        System.out.println("Traveled distance "+ distance);
        return distance;
    }
//    public double accelerate (double speed, double durationInHours){
//        double cheatingSpeed = 2 *speed;
//        return super.accelerate(cheatingSpeed,durationInHours);
//    }
    //co-variant return type

    @Override
    public AutoVehicle returnSomeVehicle() {
        return new AutoVehicle();
    }
    public void test(){
        System.out.println("test");
    }
}
