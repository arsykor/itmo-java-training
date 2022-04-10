package org.Lab1;

public class SixExercise {
    private int b;

    public int getB() {
        return this.b;
    }

    public SixExercise(int b) {
        this.b = b;
    }

    public void chechNumber() {
        String stringOut = this.b % 2 == 0 ? "Четное" : "Нечетное";
        System.out.println(stringOut);
        if (this.b % 2 == 0 && this.b > 100) {
            System.out.println("Выход за пределы диапазона");
        }
    }
}
