package org.example.adapter;

public class Adapter extends DigitalWatch {
    public Adapter(WatchWithArrows mechanicalWatch) {
        super();
        int hours = mechanicalWatch.angle1 / 12;
        int minutes = mechanicalWatch.angle2 / 60;
        this.hours = hours;
        this.minutes = minutes;
    }
}

