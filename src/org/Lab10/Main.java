package org.Lab10;

import com.sun.source.tree.IfTree;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /* Exercise 1 */

        File file = new File("files/text.txt");
//        ArrayList<String> strings = stringsList(file);
//
//        for (int i = 0; i < strings.size(); i++) {
//            System.out.println(strings.get(i));
//        }
//        stringsList(file);

        /* Exercise 2 */
//        String st = "This string is supposed to be in text.txt";
//        boolean clearBeforeImport = false;
//        writeToFile(file, st, clearBeforeImport);

        /* Exercise 3 */
//        File file1 = new File("files/file1.txt");
//        File file2 = new File("files/file2.txt");
//        joinFiles(file1, file2);

        /* Exercise 4 */
        changeNoLettersAndNumbers(file);
    }

    private static void changeNoLettersAndNumbers(File file) {
        ArrayList<String> strings = stringsList(file);
        boolean clearBeforeImport = false;

        for (String s : strings) {
            StringBuilder sb = new StringBuilder(s);
            removeBlankSpace(sb);

            for (int i = 0; i < sb.length(); i++) {
                if (!Character.isDigit(sb.charAt(i)) && !Character.isLetter(sb.charAt(i))){
                    sb.replace(i,i+1,"$");
                }
            }

            writeToFile(file, sb.toString(), clearBeforeImport);
            clearBeforeImport = true;
        }
    }

    private static void joinFiles(File file1, File file2) {
        File fileJoin = new File("files/text.txt");

        ArrayList<String> stringsF1 = stringsList(file1);
        ArrayList<String> stringsF2 = stringsList(file2);

        boolean clearBeforeImport = false;

        for (int i = 0; i < stringsF1.size(); i++) {
            writeToFile(fileJoin, stringsF1.get(i), clearBeforeImport);

            if (i == 0) clearBeforeImport = true; // clear only once
        }

        for (int i = 0; i < stringsF2.size(); i++) {
            writeToFile(fileJoin, stringsF2.get(i), true);
        }
    }

    private static void writeToFile(File file, String st, boolean clearBeforeImport) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, clearBeforeImport))) {
            writer.write("\n" + st);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static ArrayList<String> stringsList(File file) {

        ArrayList<String> strings = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String input = null;
            while ((input = reader.readLine()) != null) {
                //System.out.println(input);
                strings.add(input);
            }
            return strings;

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return strings;
    }

    static void removeBlankSpace(StringBuilder sb) {
        int j = 0;
        for(int i = 0; i < sb.length(); i++) {
            if (!Character.isWhitespace(sb.charAt(i))) {
                sb.setCharAt(j++, sb.charAt(i));
            }
        }
        sb.delete(j, sb.length());
    }
}
