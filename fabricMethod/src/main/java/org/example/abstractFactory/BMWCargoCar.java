package org.example.abstractFactory;

public class BMWCargoCar implements CargoCar{
    @Override
    public void assembly() {
        System.out.println("New BMW Cargo Car!");
    }
}
