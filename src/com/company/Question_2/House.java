package com.company.Question_2;

public class House {

    public House(String color, String type, int age) {
        this.color = color;
        this.type = type;
        this.age = age;
    }

    String color;
    String type;
    int age;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
