package org.Lab7;

public class Truck extends Car {
    int wheelsNumber;
    int maxWeight;

    public Truck() {
    }

    public Truck(int w, String m, char c, float s, int wheelsNumber, int maxWeight) {
        super(w, m, c, s);
        this.wheelsNumber = wheelsNumber;
        this.maxWeight = maxWeight;
    }

    public void newWheels(int newNumber) {
        wheelsNumber = newNumber;
        System.out.println(newNumber);
    }
}
