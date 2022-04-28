package org.Lab11;

import javax.swing.plaf.nimbus.State;

public class Main {
    public static void main(String[] args) {

        /* Exercise 1 */
        oneHundred();

        /* Exercise 2 */
        treadCondition();

        /* Exercise 3 */
        //Хотел через делегат сделать, но выяснил что его вроде как нет в Java
        //Получилось только через последовательный запуск (join).
        forCounter();

        /* Exercise 4 */
        //twoThreads(); //попытка 1 - неудачная.
        twoThreadsTwo(); //попытка 2 - удачная. Пример подмсотрел на Metanit - переделал под данную задачу.
    }

    private static void twoThreadsTwo() {
        Writer writer = new Writer();

        IWriteMyName1 iWriteMyName1 = new IWriteMyName1(writer);
        IWriteMyName2 iWriteMyName2 = new IWriteMyName2(writer);

        new Thread(iWriteMyName1).start();
        new Thread(iWriteMyName2).start();
    }

    private static void twoThreads() {
        MyThread3 myThread3 = new MyThread3();
        MyThread4 myThread4 = new MyThread4();

        myThread3.start();
        myThread4.start();
    }

    public static volatile Counter counter = new Counter();

    private static synchronized void forCounter() {

        for (int i = 0; i < 100; i++) {
            MyThread2 myThread = new MyThread2(counter);
            myThread.start();
            try {
                myThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(counter.count);
    }

    private static void treadCondition() {
        MyThread myThread = new MyThread();

        System.out.println(myThread.getState());

        myThread.start();
        try {
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(myThread.getState());
    }

    private static void oneHundred() {
        for (int i = 0; i < 10; i++) {
            new MyThread().start();
        }
    }
}
