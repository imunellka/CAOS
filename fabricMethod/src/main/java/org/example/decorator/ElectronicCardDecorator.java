package org.example.decorator;

class ElectronicCardDecorator implements ElectronicCard {
    protected ElectronicCard wrappee;

    ElectronicCardDecorator(ElectronicCard wrappee) {
        this.wrappee = wrappee;
    }

    public void getInfo() {
        wrappee.getInfo();
    }

    @Override
    public void getPass() {
        wrappee.getPass();

    }

    @Override
    public void getPolis() {
        wrappee.getPolis();
    }
}

