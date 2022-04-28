package org.Lab11;

public class MyThread4 extends Thread {
    @Override
    public synchronized void run() {
        notify();

        while (true) {
            System.out.println(Thread.currentThread().getName());
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
