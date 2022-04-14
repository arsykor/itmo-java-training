package org.Lab7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Parent2 {
    int userAge;

    public void askUserAge() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            userAge = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
