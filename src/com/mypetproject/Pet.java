package com.mypetproject;

public class Pet{

    //attribute fields
    public String species;
    
    //contstructor method:
    public Pet(String species) {
        this.species = species;
    }

    public void getSpecies() {
        System.out.println("loading...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("thinking...");
        try {
            Thread.sleep(3000); 
        } catch (InterruptedException e) {
            
            Thread.currentThread().interrupt(); 
        }
        System.out.println("calculating the derivative of x^2...");
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            
            Thread.currentThread().interrupt(); 
        }
        System.out.println("calculating the integral of 4...");
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            
            Thread.currentThread().interrupt(); 
        }
        System.out.println("calculating the limit of x^2/|x|...");
        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            
            Thread.currentThread().interrupt(); 
        }
        System.out.println("This pet is a "  + species);
        return;
    }

}