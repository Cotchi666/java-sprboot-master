package org.example;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
       EUCar eu = new EUCar();

        Car car = new Car("new car",eu);
            car.hornDetails();


    }

}