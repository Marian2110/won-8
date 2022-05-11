package com.accenture.day4.homework.ex1;

public class Cosmetics extends Product {
    private final String color;
    private final double weight;

    public Cosmetics(String name, String description, int quantity, double price, String color, double weight) {
        super(name, description, quantity, price);
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Cosmetics{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                "} " + super.toString();
    }
}
