package org.Lab11;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(this.getState());

        for (int i = 0; i < 101; i++) {
            System.out.println(i);
        }
    }
}