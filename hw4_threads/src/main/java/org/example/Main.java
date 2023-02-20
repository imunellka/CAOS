package org.example;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> shop = new ArrayList<>();
        var cons1 = new Thread(new Consumer(shop,"First"));
        var cons2 = new Thread(new Consumer(shop,"Second"));
        var cons3 = new Thread(new Consumer(shop,"Third"));
        var prod1 = new Thread(new Producer(10, shop));
        prod1.start();
        cons1.start();
        cons2.start();
        cons3.start();
    }
}