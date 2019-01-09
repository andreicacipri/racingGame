package org.fasttrackit;

public class Vehicle {

    public static int applicationTotalNumberOfVehicles;


    public String name;
    public String color;
    public double mileage;
    public long totalKm;



        public double accelerate (double speed, double durationInHours){
            System.out.println( name + " accelerated with " + speed + " km/h  for " + durationInHours + " hours.");
           double distance = speed * durationInHours;
            System.out.println("Traveled distance "+ distance);
            return distance;
        }
        //method overloading
        public double accelerate (double speed) {
            return accelerate(speed, 1);
        }
        public Vehicle returnSomeVehicle(){
            return this;

            }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public long getTotalKm() {
        return totalKm;
    }

    public void setTotalKm(long totalKm) {
        this.totalKm = totalKm;
    }
}
