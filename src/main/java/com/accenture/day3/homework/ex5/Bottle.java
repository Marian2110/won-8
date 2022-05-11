package com.accenture.day3.homework.ex5;

public class Bottle {
    private final double totalCapacity;
    private double availableQuantity;
    private boolean open;

    public Bottle(double volume, double liquid) {
        this.totalCapacity = volume;
        if (volume < 0) {
            this.availableQuantity = 0;
        } else if (liquid > totalCapacity) {
            this.availableQuantity = totalCapacity;
        } else {
            this.availableQuantity = volume;
        }
        this.open = false;
    }

    public boolean isEmpty() {
        return availableQuantity == 0;
    }

    public double getAvailableQuantity() {
        return availableQuantity;
    }

    public double getEmptyCapacity() {
        return totalCapacity - availableQuantity;
    }
    public void openBottle() {
        if (open) {
            System.out.println("Bottle is already open");
            return;
        }

        this.open = true;
        System.out.println("Bottle opened");
    }

    public void closeBottle() {
        if (!open) {
            System.out.println("Bottle is already closed");
            return;
        }

        open = false;
        System.out.println("Bottle closed");
    }

    public void drink(double quantity) {
        if (!open) {
            System.out.println("Bottle is closed");
            return;
        }

        if (quantity > availableQuantity) {
            System.out.println("Not enough water");
            return;
        }

        availableQuantity -= quantity;
        System.out.println("Drank " + quantity + "ml");
    }
}
