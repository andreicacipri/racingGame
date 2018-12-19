package org.fasttrackit;
// inheritance or 'is-a' relationship
public class Car extends AutoVehicle {
// instance variables (declared as a propperties of a class)
    // they receive default values( null for objects, 0 for numbers,false for boolean)
    int doorCount;


    public Car(Engine engine) {
        super(engine);
    }
}
