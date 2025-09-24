package com.mypetproject;

public class Main {
    public static void main(String[] args) {
        Pet myPet = new Pet("Cat");
        myPet.getSpecies();
        Cat myCat = new Cat("Cat", 3, "Black");
        myCat.getDetails();
    }
}