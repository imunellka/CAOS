package org.example.factoryMethod;

public class AndroidFactory extends PhoneFactory {
    @Override
    public SmartPhone NewPhone() {
        return new Android();
    }
}
