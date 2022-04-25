package org.Lab8;

public class Plaine2 {
    String name;
    int age;
    Plaine2.Wing wing;

    public Plaine2(){
        Plaine2.Wing wing = new Plaine2.Wing();
        this.wing = wing;
    }

    public Plaine2(String name, int age) {
        this.name = name;
        this.age = age;

        Plaine2.Wing wing = new Plaine2.Wing();
        this.wing = wing;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    class Wing{
        int weight;

        @Override
        public String toString() {
            return "Weight of the Wing is " + weight;
        }
    }

    public static void main(String[] args) {
        Plaine2 plain = new Plaine2("The Plain", 20);

        plain.wing.weight = 1500;
        System.out.println(plain.wing.toString());
    }
}
