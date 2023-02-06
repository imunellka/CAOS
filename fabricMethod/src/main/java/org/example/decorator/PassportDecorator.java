package org.example.decorator;

class PassportDecorator extends ElectronicCardDecorator {
    PassportDecorator(ElectronicCard wrappee) {
        super(wrappee);
    }

    public void getInfo() {
        wrappee.getPass();
    }
}
