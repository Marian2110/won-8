package com.accenture.day4.homework.ex1;

public class Main {
    public static void main(String[] args) {
        Electronics fridge = new Fridge("Samsung","the best fridge",1000,20.34,"No-frost",100,80,220,40,-21);
        Product gloss = new Cosmetics("Gloss","the best gloss",100,20.34,"Cyan",0.3);

        String description = gloss.getDescription();
        System.out.println(description);


    }
}
