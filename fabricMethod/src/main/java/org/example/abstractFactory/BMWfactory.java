package org.example.abstractFactory;

public class BMWfactory  implements CarFactory{
    @Override
    public BMWPassengerCar createPassengerCar() {
        return new BMWPassengerCar();
    }

    @Override
    public BMWCargoCar createCargoCar() {
        return new BMWCargoCar();
    }
}
