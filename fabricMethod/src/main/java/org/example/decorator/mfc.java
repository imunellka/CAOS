package org.example.decorator;

class mfc {
    public void configurationExample(boolean pass, boolean card) {

        ElectronicCard source = new UniversalCard(123, 234, 345, 456);
        if (pass) {
            source = new PassportDecorator(source);
        }
        if (card) {
            source = new PassportDecorator(source);
        }
        source.getInfo();
    }
}
