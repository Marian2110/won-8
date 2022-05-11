package com.accenture.day3.homework.ex5;

public class Main {
    public static void main(String[] args) {
        Bottle bottle = new Bottle( 2.5, 2.5);
        System.out.println(bottle.getAvailableQuantity() + " liters available");
        bottle.openBottle();
        bottle.openBottle();
        bottle.closeBottle();
        bottle.drink(0.5);
        System.out.println(bottle.getAvailableQuantity() + " liters left");



    }



}
