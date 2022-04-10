package org.Lab6;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> listStrings = new ArrayList<String>();
        String st1, st2, st3, st4, st5, st6, st7, st8, changeTo, changeWhat, st9, st10, st11;

        /* Exercise 1 */
        st1 = "The longest one";
        st2 = "Short";
        st3 = "The longest the";

        listStrings.add(st1);
        listStrings.add(st2);
        listStrings.add(st3);

        //System.out.println(longestString(listStrings).toString());

        /* Exercise 2 */
        st4 = "оно";
        st5 = "онно";
        st6 = "строка не палингдром";
        st7 = "а роза упала на лапу азора";

        if (isPalindrome(st7)){
            System.out.println("Given string is palindrome.");
        }
        else {
            System.out.println("Given string is not palindrome.");
        }

        /* Exercise 3 */
        st8 = "Тут надо бяка заменить.";
        changeWhat = "бяка";
        changeTo = "[вырезано цензурой]";
        //System.out.println(changeByaka(st8, changeWhat, changeTo));

        /* Exercise 4 */
        st9 = "Этот тест нужно обработать правильно, нужно обработать правильно и корректно.";
        st10 = "нужно обработать правильно";
        System.out.println("Number of occurrences is " + isPart(st9, st10));

        /* Exercise 5 */
        st11 = "This is a test string";
        System.out.println("The given string is: " + st11);
        System.out.println("The string reversed word by word is: " + reverseString(st11));
    }

    private static String reverseString(String string) {
        String[] tempArray = string.split(" ");
        String[] tempArray2 = new String[tempArray.length];


        for (int i = 0; i < tempArray.length; i++) {
            StringBuilder sb = new StringBuilder(tempArray[i]);
            tempArray2[i] = sb.reverse().toString();
        }

        return String.join(" ", tempArray2);
    }

    private static String isPart(String st9, String st10) {
        if (st10.length() == 0){
            return "Error";
        }
        String tempStr = st9.replaceAll(st10, "");
        return String.valueOf((st9.length() - tempStr.length()) / st10.length());
    }

    private static String changeByaka(String string, String changeWhat, String changeTo) {
        return string.replaceAll(changeWhat, changeTo);
    }

    private static boolean isPalindrome(String st4) {
        String tempString = st4.replaceAll(" ","");
        String[] tempArray = tempString.split("");
        int len = tempArray.length - 1;

        for (int i = 0; i < tempArray.length; i++) {
            if (tempArray[i].equals(tempArray[len])){
                len--;
            }
            else {
                return false;
            }
        }
        return true;
    }

    private static ArrayList<String> longestString(ArrayList<String> listStrings) {
        int max = 0;
        int a = 0;
        ArrayList<String> tempArray = new ArrayList<String>();

        for (int i = 0; i < listStrings.size(); i++) {
            if (listStrings.get(i).length() > max){
                max = listStrings.get(i).length();
            }
        }

        for (int i = 0; i < listStrings.size(); i++) {
            if (listStrings.get(i).length() == max){
                tempArray.add(listStrings.get(i));
            }
        }

        return tempArray;
    }
}
