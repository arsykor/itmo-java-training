package org.Lab3;

public class Main {
    public static void main(String[] args) {

        /* Exercise 1 */
        int a,b,c,d,e,f;

        /* 1.1. */
        //oddNumbers();

        /* 1.2. */
        //secondVivod();

        /* 1.3. */
        a = 3;
        b = 9;
        c = 12;

        //sumEqual(a,b,c);

        /* 1.4. */
        d = 4;
        e = 6;
        f = 7;

        multAll(d,e,f);
    }

    private static void multAll(int d, int e, int f) {
        boolean ret;

        System.out.println("First number: " + d);
        System.out.println("Second number: " + e);
        System.out.println("Third number: " + f);

        ret = e > d && f > e ? true : false;

        System.out.println("Result: " + ret);

    }

    private static void sumEqual(int a, int b, int c) {

        boolean ret;

        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);
        System.out.println("Third number: " + c);

        ret = a + b == c ? true : false;

        System.out.println("Result: " + ret);
    }

    private static void secondVivod() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0){
                System.out.println(i + " is divisible by 3");
            }
            if (i % 5 == 0){
                System.out.println(i + " is divisible by 5");
            }
            if (i % 15 == 0){
                System.out.println(i + " is divisible by 3 and 5");
            }
        }
    }

    public static void oddNumbers(){
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
