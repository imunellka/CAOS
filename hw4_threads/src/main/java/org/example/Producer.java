package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Producer implements Runnable {
    final private ArrayList<Integer> shop;
    int size;

    Producer(int size, ArrayList<Integer> shop) {
        this.shop = shop;
        this.size = size;
    }

    void produce() throws InterruptedException {
        synchronized (shop) {
            if (shop.size() < size) {
                Random rnd = new Random();
                shop.add(rnd.nextInt(15));
                System.out.println("Produce new phone!");
                Thread.sleep(500);
            }
        }
    }

    @Override
    public void run() {
        for (; ; ) {
            try {
                produce();
            } catch (InterruptedException e) {
                throw new RuntimeException("Sorry, but" + e.getMessage());
            }
        }
    }
}
