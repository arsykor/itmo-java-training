package org.Lab9;
import com.sun.source.tree.IfTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        /* Exercise 1*/

        String[] array = new String[4];
        array[0] = "One";
        array[1] = "Two";
        array[2] = "Two";
        array[3] = "Two";

        //Set<Object> set = removeDuplicates(array);
        //System.out.println(set);

        /* Exercise 2*/

//        ArrayList<Integer> arrayList = addMillionArray();
//        LinkedList<Integer> linkedList = addMillionLinked();
//
//        long start = System.currentTimeMillis();
//        randomFromArray(arrayList);
//        long finish = System.currentTimeMillis();
//        long time = finish - start;
//        System.out.println("Time for ArrayList is: " + time + " milliseconds.");
//
//        long start2 = System.currentTimeMillis();
//        randomFromLinked(linkedList);
//        long finish2 = System.currentTimeMillis();
//        long time2 = finish2 - start2;
//        System.out.println("Time for LinkedList is: " + time2 + " milliseconds.");
//
//        long dif =  time > time2 ? time - time2 : time2 - time;
//
//        System.out.println("Difference is: " + dif);
//        System.out.println("The reason for that is that LinkedList also use some memory for collecting memory address for both previous and next elements.");

        /* Exercise 3 */
        Map<User, Integer> map = new HashMap<>();

        map.put(new User("Arseny"), 100);
        map.put(new User("Ivan"), 23);
        map.put(new User("Kate"), 50);
        map.put(new User("John"), 90);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //System.out.println(getScore((reader.readLine()), map));
        System.out.println(getScore("Kate", map)); // Почему-то через считывание не срабатывает, пока не успел разобраться.
    }

    private static int getScore(String name, Map<User, Integer> map) {
        //return map.get(name) == null ? 0 : map.get(name);
        for (User u : map.keySet()) {
            if (u.getName() == name){
                return map.get(u);
            }
        }

        return  0;
    }

    private static void randomFromLinked(LinkedList<Integer> linkedList) {
        for (int i = 0; i < 100000; i++) {
            int random = linkedList.get((int) (Math.random() * ((100) + 1)));
        }
    }

    private static void randomFromArray(ArrayList<Integer> arrayList) {
        for (int i = 0; i < 100000; i++) {
            int random = arrayList.get((int) (Math.random() * ((100) + 1)));
        }
    }

    private static LinkedList<Integer> addMillionLinked() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add((int) (Math.random() * ((100) + 1)));
        }

        return linkedList;
    }

    private static ArrayList<Integer> addMillionArray() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add((int) (Math.random() * ((100) + 1)));
        }

        return arrayList;
    }

    private static Set<Object> removeDuplicates(String[] array) {
        Set<Object> set = new TreeSet<>();

        for (Object item : array) {
            set.add(item);
        }
        return set;
    }
}
