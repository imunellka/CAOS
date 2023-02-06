package org.example.abstractFactory;

public class BMWPassengerCar implements PassengerCar{
    @Override
    public void assembly() {
        System.out.println("New BMW Passenger Car!");
    }
}
