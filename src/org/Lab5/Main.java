package org.Lab5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] array;

        /* Exercise 1 */
        array = new int[]{2,4,6,54,66,600};

        System.out.println(sortedAscending(array) ? "Sorted ascending" : " Not sorted ascending");

        /* Exercise 2 */
        arraysVivod();
    }

    private static void arraysVivod() throws IOException {
        int[] array;
        int number;

        System.out.println("Write down array items' number:");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String itemsNumber = reader.readLine();
        number = Integer.parseInt(itemsNumber);

        array = new int[number];

        System.out.println("Alternately enter the items:");

        for (int i = 0; i < number; i++) {
            BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
            String itemsNumber2 = reader.readLine();

            array[i] = Integer.parseInt(itemsNumber2);
        }

        System.out.println(Arrays.toString(array));
    }

    private static boolean sortedAscending(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            if (array[i+1] < array[i]){
                return false;
            }
        }
        return true;
    }
}

//(i == array.length || array[i+1] < array[i])
//Хотел в начале в условие вот так написать, думал что отбросит второе условие, дабы не вызвать исключение. Но вызвалось )
