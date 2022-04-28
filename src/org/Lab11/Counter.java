package org.Lab11;

class Counter {
    public volatile int count = 0;

    public void increment() {
        count = count + 1;
    }
    public int getCount() {
        return count;
    }
}

