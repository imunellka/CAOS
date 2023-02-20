package org.example;

import java.util.ArrayList;

public class Consumer implements Runnable {
    final private ArrayList<Integer> shop;
    final private String name;

    Consumer(ArrayList<Integer> shop, String name) {
        this.shop = shop;
        this.name= name;
    }

    void consume() throws InterruptedException {
        synchronized (shop) {
            if (!shop.isEmpty()) {
                System.out.println(name+ " consumer buy iphone : " + shop.remove(0));
                Thread.sleep(700);
            }
        }
    }

    @Override
    public void run() {
        for (; ; ) {
            try {
                consume();
            } catch (InterruptedException e) {
                throw new RuntimeException("Sorry, but" + e.getMessage());
            }
        }
    }
}
