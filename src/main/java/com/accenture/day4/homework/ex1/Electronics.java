package com.accenture.day4.homework.ex1;

public class Electronics extends Product {
    private final String type;
    private final double length;
    private final double width;
    private final double height;
    private final double weight;

    public Electronics(String name, String description, int quantity, double price, String type, double length, double width, double height, double weight) {
        super(name, description, quantity, price);
        this.type = type;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "type='" + type + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", weight=" + weight +
                ", name='" + getName() + '\'' +
                ", price=" + getPrice() +
                '}';
    }

}