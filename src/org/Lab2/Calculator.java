package org.Lab2;

public class Calculator {
    public Calculator() {
    }

    public static void sum(int n1, int n2) {
        System.out.println(n1 + n2);
    }

    public static void sub(int n1, int n2) {
        System.out.println(n1 - n2);
    }

    public static void mult(int n1, int n2) {
        System.out.println(n1 * n2);
    }

    public static void div(int n1, int n2) {
        System.out.println(n2 == 0 ? "You can't divide by zero" : n1 / n2);
    }
}
