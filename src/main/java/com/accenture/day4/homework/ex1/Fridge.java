package com.accenture.day4.homework.ex1;

public class Fridge extends Electronics{
    private int temperature;

    public Fridge(String name, String description, int quantity, double price, String type, double length, double width, double height, double weight, int temperature) {
        super(name, description, quantity, price, type, length, width, height, weight);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "temperature=" + temperature +
                '}';
    }
}
