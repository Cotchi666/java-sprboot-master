package org.example;

public class Car {
    String name = null;
    Vehicles vehicles;
    public Car(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    public void hornDetails(){
        vehicles.Horn();
        System.out.println("starting ");
    }
}
