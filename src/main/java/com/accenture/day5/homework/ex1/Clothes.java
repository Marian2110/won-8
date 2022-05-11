package com.accenture.day5.homework.ex1;

public class Clothes implements ShopItem {
    private final String name;
    private final int price;
    private final Category category;

    public Clothes(String name, int price, Category category) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        if (category == null) {
            throw new IllegalArgumentException("Category cannot be null");
        }

        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public Category getCategory() {
        return category;
    }
}
