package org.example.abstractFactory;

public class MersPassengerCar implements PassengerCar{
    @Override
    public void assembly() {
        System.out.println("New Mers Passenger Car!");
    }
}