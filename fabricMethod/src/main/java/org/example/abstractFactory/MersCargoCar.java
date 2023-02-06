package org.example.abstractFactory;

public class MersCargoCar implements CargoCar{
    @Override
    public void assembly() {
        System.out.println("New Mers Cargo Car!");
    }
}