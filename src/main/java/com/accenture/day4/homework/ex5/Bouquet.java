package com.accenture.day4.homework.ex5;

import java.util.Collection;
import java.util.HashSet;

public class Bouquet {
    private Collection<String> flowers;

    public Bouquet() {
        flowers = new HashSet<>();
    }

    public void addFlower(String flower) {
        if (flowers.contains(flower)) {
            System.out.println("Flower " + flower + " already exists");
            return;
        }
        flowers.add(flower);
        System.out.println("Flower " + flower + " added");
    }

    public void removeFlower(String flower) {
        if (!flowers.contains(flower)) {
            System.out.println("Flower  " + flower + "  does not exist");
            return;
        }

        flowers.remove(flower);
        System.out.println("Flower " + flower + " removed");
    }

    public Collection<String> printFlowers() {
        return flowers;
    }
}
