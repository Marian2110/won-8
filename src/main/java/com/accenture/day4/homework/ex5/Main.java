package com.accenture.day4.homework.ex5;

public class Main {
    public static void main(String[] args) {
        var uniqueFlowersBouquet = new Bouquet();
        uniqueFlowersBouquet.addFlower("White Rose");
        uniqueFlowersBouquet.addFlower("Yellow Rose");
        uniqueFlowersBouquet.addFlower("Yellow Rose");
        uniqueFlowersBouquet.addFlower("Tulip");
        uniqueFlowersBouquet.removeFlower("Rose");

        System.out.println(uniqueFlowersBouquet.printFlowers());

    }
}
