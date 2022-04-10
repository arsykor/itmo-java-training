package org.Lab1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws IOException {
        int a,b,c,d,e,f,z,q;
        double g,k,l,result3;

        System.out.println("Я");
        System.out.println("Хорошо");
        System.out.println("Знаю");
        System.out.println("Java");

        a = 46;
        b = 10;
        c = 3;
        d = 29;
        e = 4;
        f = -15;
        double result1 = (a + b) * (b / c);
        int result2 = d * e * f;
        System.out.println("First result: " + result1);
        System.out.println("Second result: " + result2);
        g = 3.6D;
        k = 4.1D;
        l = 5.9D;
        result3 = g * k * l;
        System.out.println("Third result: " + result3);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(reader.readLine());
        System.out.println(reader2.readLine());
        System.out.println(reader3.readLine());
        z = 0;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            z = scanner.nextInt();
        }

        SixExercise se = new SixExercise(z);
        se.chechNumber();

        System.out.println("Задание, что пропустил:");
        q = 10500;
        System.out.println(q/100);
    }
}
