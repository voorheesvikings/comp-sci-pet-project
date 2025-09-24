package com.mypetproject;

public class Cat extends Pet {
    private String color;
    private int age;

    public Cat(String species, int age, String color) {
        super(species);
        this.age = age;
        this.color = color;
    }

    public void getDetails() {
        System.out.println("This cat is a " + color + " cat and is " + age + " years old.");
    }
}