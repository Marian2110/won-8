package com.accenture.day4.homework.ex4;

public class Main {
    public static void main(String[] args) {
        var fruitsBasket = new Basket();

        fruitsBasket.add("apple");
        fruitsBasket.add("orange");
        fruitsBasket.add("banana");
        fruitsBasket.add("apple");
        fruitsBasket.add("orange");
        fruitsBasket.add("banana");
        fruitsBasket.add("apple");

        fruitsBasket.count();
        fruitsBasket.customCount();
        System.out.println(fruitsBasket.find("banana"));
        System.out.println(fruitsBasket.find("apple"));
        fruitsBasket.remove("apple");

        fruitsBasket.customCount();
        fruitsBasket.add("berry");
        fruitsBasket.position("berry");
        System.out.println("Distinct fruits in basket: " + fruitsBasket.printDistinctFruits());
    }
}

