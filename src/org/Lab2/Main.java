package org.Lab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Choose the operation");
        System.out.println("Sum - 1");
        System.out.println("Sub - 2");
        System.out.println("Mult - 3");
        System.out.println("Div - 4");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String answer = reader.readLine();
        System.out.println(answer);
        System.out.println("Type two numbers");
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        String sNumber1 = reader2.readLine();
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        String sNumber2 = reader3.readLine();
        int Number1 = Integer.parseInt(sNumber1);
        int Number2 = Integer.parseInt(sNumber2);
        byte var10 = -1;
        switch(answer.hashCode()) {
            case 49:
                if (answer.equals("1")) {
                    var10 = 0;
                }
                break;
            case 50:
                if (answer.equals("2")) {
                    var10 = 1;
                }
                break;
            case 51:
                if (answer.equals("3")) {
                    var10 = 2;
                }
                break;
            case 52:
                if (answer.equals("4")) {
                    var10 = 3;
                }
        }

        switch(var10) {
            case 0:
                Calculator.sum(Number1, Number2);
                break;
            case 1:
                Calculator.sub(Number1, Number2);
                break;
            case 2:
                Calculator.mult(Number1, Number2);
                break;
            case 3:
                Calculator.div(Number1, Number2);
                break;
            default:
                System.out.println("Please, try again.");
        }
    }
}
