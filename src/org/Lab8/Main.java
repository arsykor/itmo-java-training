package org.Lab8;

public class Main {
    public static void main(String[] args) {
        Plain plain = new Plain("The Plain", 20);

        plain.wing.weight = 1500;
        System.out.println(plain.wing.toString());
    }
}
