package org.Lab4;

public class Demo {
    private String color;
    private String name;
    private int weight;

    public Demo(){
    }

    public Demo(String color){
        this.color = color;
    }

    public Demo(String color, int weight){
        this.color = color;
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String toString(){
        return name + "'s color is " + color + " and weight is " + weight + ".";
    }
}
