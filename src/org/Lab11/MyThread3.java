package org.Lab11;

public class MyThread3 extends Thread {
    public int count = 0;

    @Override
    public synchronized void  run() {
        if (count > 0) {
            notify();
        }
        while (true) {
            System.out.println(Thread.currentThread().getName());
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count++;
        }
    }
}
