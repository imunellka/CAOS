package org.example.decorator;

class PolisDecorator extends ElectronicCardDecorator {
    PolisDecorator(ElectronicCard wrappee) {
        super(wrappee);
    }

    public void getInfo() {
        wrappee.getPolis();
    }
}
