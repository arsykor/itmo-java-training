package org.Lab8;

public class Plain {
    String name;
    int age;
    Wing wing;

    public Plain(){
        Wing wing = new Wing();
        this.wing = wing;
    }

    public Plain(String name, int age) {
        this.name = name;
        this.age = age;

        Wing wing = new Wing();
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
}
