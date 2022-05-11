package com.accenture.day3.homework.ex6;

public class Service {


    private final String name;
    private final double price;

    public Service(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "Service{" + "name=" + name + ", price=" + price + '}';
    }
}
