package org.example.abstractFactory;

public interface CarFactory {
    PassengerCar createPassengerCar();
    CargoCar createCargoCar();
}
