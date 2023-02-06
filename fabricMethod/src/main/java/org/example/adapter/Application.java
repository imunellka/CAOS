package org.example.adapter;

public class Application {
    public void getTime(WatchWithArrows watch) {
        DigitalWatch a = new Adapter(watch);
        System.out.println("Time h: " + a.hours + "and m: " + a.minutes);
    }
}
