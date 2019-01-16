package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Game game = new Game();
       game.addTrack(0,new Track("Highway",300 ));
       game.addTrack(1,new Track("Seaside",100 ));
       game.addTrack(2,new Track("Dakar",250 ));
        game.displayAvailableTracks();



//       // declare a variable and instanting a Car object
//    Car firstCompetitor = new Car(new Engine());
//    firstCompetitor.setName("Dacia");
//    firstCompetitor.setColor("black");
//    firstCompetitor.doorCount = 6;
//    firstCompetitor.setMileage(9.5);
//    Engine firstEngine =new Engine();
//    firstEngine.manufacturer = "Renault";
//     //local variables are variables declared inside main
//     //they don;t receive default values
//     Car secondCompetitor =new Car(new Engine());
//     secondCompetitor.setName("Golf");
//     // sout print a message to the console
//    System.out.println(firstEngine.manufacturer);
//    firstCompetitor.engine = firstEngine;
//     firstCompetitor.engine.manufacturer ="BMW";
//     System.out.println(firstEngine.manufacturer);

//    double traveledDistance = firstCompetitor.accelerate(100, 30);
//     System.out.println(traveledDistance);
//  Vehicle vehicle = new Vehicle();
//  Vehicle.applicationTotalNumberOfVehicles = 1;
//     System.out.println("Total from vehicle 1: "+ Vehicle.applicationTotalNumberOfVehicles);
//     Vehicle vehicle2 = new Vehicle();
//     Vehicle.applicationTotalNumberOfVehicles = 2;
//     System.out.println("Total from vehicle 2: "+ Vehicle.applicationTotalNumberOfVehicles);
//     System.out.println("Total from vehicle 1: "+ Vehicle.applicationTotalNumberOfVehicles);
//     CheatingCar firstCheatingCar = new CheatingCar();
//     firstCheatingCar.name = "Logan";
//     firstCheatingCar.accelerate(2,2);

//     Vehicle cheatingCar = new CheatingCar();
//     cheatingCar.accelerate(10,2);
//     //type casting
//     ((CheatingCar) cheatingCar).test();



    }

}
