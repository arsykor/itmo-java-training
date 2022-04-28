package org.Lab11;

public class Writer{

    private boolean counter = false;
    public synchronized void writeMyName2(String name) {
        while (!counter) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        counter = false;
        System.out.println(name);
        notify();
    }
    public synchronized void writeMyName1(String name) {
        while (counter) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        counter = true;
        System.out.println(name);
        notify();
    }
}
