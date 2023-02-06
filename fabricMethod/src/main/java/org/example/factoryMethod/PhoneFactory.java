package org.example.factoryMethod;

public abstract class PhoneFactory {
    public void assembly() {
        SmartPhone phone = NewPhone();
        phone.assembly();
    }
    public abstract SmartPhone NewPhone();
}

