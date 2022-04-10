package org.Lab5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.IllegalFormatCodePointException;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] array;
        int varTemp;

        /* Exercise 1 */
        array = new int[]{2,4,2,66,4,7,7};

        System.out.println(sortedAscending(array) ? "Sorted ascending" : " Not sorted ascending");

        /* Exercise 2 */
        //arraysVivod();

        /* Exercise 3 */
        //arraysChange(array);

        /* Exercise 4 */
        arrayUnique(array);
    }

    private static void arrayUnique(int[] array) {
        boolean couldBe = false;

        for (int i = 0; i < array.length; i++) { //Arrays.asList().contains(array[i]); Использовал бы так

            for (int j = 0; j < array.length; j++) {
                if (array[i] != array[j] || i == j){
                    couldBe = true;
                }
                else {
                    couldBe = false;
                    break;
                }
            }

            if (couldBe){
                writeResult(array[i]);
                return;
            }
            else {
                continue;
            }
        }
        writeResult();
        return;
    }

    private static void writeResult(int i) {
        System.out.println("The unique value is " + i);
    }

    //Перегрузка
    private static void writeResult() {
        System.out.println("There are no unique items in the array.");
    }


    private static void arraysChange(int[] array) {
        int varTemp;

        varTemp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = varTemp;

        System.out.println(Arrays.toString(array));
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
