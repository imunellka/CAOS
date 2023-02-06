package org.example.factoryMethod;

public class IPhoneFactory extends PhoneFactory {
    @Override
    public SmartPhone NewPhone() {
        return new IPhone();
    }
}
