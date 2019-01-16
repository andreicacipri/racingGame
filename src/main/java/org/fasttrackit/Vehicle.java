package org.fasttrackit;

public class Vehicle {

    public static int applicationTotalNumberOfVehicles;


    public String name;
    public String color;
    public double mileage;
    public long totalKm;
    private double fuelLevel =70 ;



        public double accelerate (double speed, double durationInHours){
            System.out.println( name + " accelerated with " + speed + " km/h  for " + durationInHours + " hours.");
           double distance = speed * durationInHours;
           double spentFuel =distance * mileage/100;
            System.out.println("Traveled distance "+ distance);
            //same as:fuelLevel = fuelLevel - spentFuel;
           fuelLevel -=spentFuel;
           totalKm +=distance;
            System.out.println("Remaining fuel" + fuelLevel );
            System.out.println("Total traveled distance" + totalKm );

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

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }
}
