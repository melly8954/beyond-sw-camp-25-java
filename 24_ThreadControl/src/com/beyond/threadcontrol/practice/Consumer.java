package com.beyond.threadcontrol.practice;

public class Consumer implements Runnable {
    private final Storage storage;

    public Consumer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                storage.getProduct();
                Thread.sleep(500);  // 0.5 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
