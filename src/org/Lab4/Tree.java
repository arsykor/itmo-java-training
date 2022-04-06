package org.Lab4;

public class Tree {
    private String name;
    private int age;
    private boolean isAlive;

    public Tree(){
        System.out.println("Empty constructor");
    }

    public Tree(int age, String name){
        this.age = age;
        this.name = name;
    }

    public Tree(int age, String name, boolean isAlive){
        this.age = age;
        this.name = name;
        this.isAlive = isAlive;
    }

    @Override
    public String toString() {
        String condition = isAlive ? "still alive" : "dead";
        return "The tree's name is " + name + ", it is " + age + " years old and it is " + condition + ".";
    }
}
