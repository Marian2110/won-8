package com.accenture.day3.homework.ex7;

public class Car {
    private String model;
    private String color;
    private int year;
    private int speed;

    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.speed = 0;
    }

    public void accelerate(int speed) {
        this.speed += speed;
    }

    public void decelerate(int speed) {
        this.speed -= speed;
    }

    public void print() {
        System.out.println("Car model: " + model);
        System.out.println("Car color: " + color);
        System.out.println("Car year: " + year);
        System.out.println("Car speed: " + speed);
    }

    public void crashIt() {
        System.out.println("Boom!");
    }
}
