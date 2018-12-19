package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // declare a variable and instanting a Car object
       Car firstCompetitor = new Car(new Engine());
       firstCompetitor.setName("Dacia");
       firstCompetitor.setColor("black");
       firstCompetitor.doorCount = 6;
       firstCompetitor.setMileage(9.5);
       Engine firstEngine =new Engine();
       firstEngine.manufacturer = "Renault";
        //local variables are variables declared inside main
        //they don;t receive default values
        Car secondCompetitor =new Car(new Engine());
        secondCompetitor.setName("Golf");
        // sout print a message to the console
       System.out.println(firstEngine.manufacturer);
       firstCompetitor.engine = firstEngine;
        firstCompetitor.engine.manufacturer ="BMW";
        System.out.println(firstEngine.manufacturer);

       double traveledDistance = firstCompetitor.accelerate(100, 30);


    }
}
