package org.example.abstractFactory;

public class MersFactory implements CarFactory{
    @Override
    public BMWPassengerCar createPassengerCar() {
        return new BMWPassengerCar();
    }

    @Override
    public BMWCargoCar createCargoCar() {
        return new BMWCargoCar();
    }
}