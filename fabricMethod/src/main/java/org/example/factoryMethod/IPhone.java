package org.example.factoryMethod;

public class IPhone implements SmartPhone {
    @Override
    public void assembly() {
        System.out.println("New pink iphone!");
    }
}
