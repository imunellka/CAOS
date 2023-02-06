package org.example.decorator;

class UniversalCard implements ElectronicCard {
    protected int usedId;
    protected int passport;
    protected int polis;
    protected int card;


    UniversalCard(int userId,int passport, int polis,int card) {
        this.usedId = userId;
        this.passport = passport;
        this.polis = polis;
        this.card = card;
    }

    public void getInfo() {
        System.out.println("Your Id:");
        System.out.print(usedId);
    }
    public void getPass() {
        System.out.println("Your passport:");
        System.out.print(passport);
    }
    public void getPolis() {
        System.out.println("Your Polis:");
        System.out.print(polis);
    }

}
