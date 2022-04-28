package org.Lab11;

import java.security.PublicKey;

public class MyThread2 extends Thread {
    Counter counter;

    public MyThread2(Counter counter) {
        this.counter = counter;
    }

    @Override
    public synchronized void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}
