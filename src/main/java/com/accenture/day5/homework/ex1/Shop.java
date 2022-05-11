package com.accenture.day5.homework.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Shop<T extends ShopItem> {
    private final List<T> items;

    public Shop() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null");
        }
        items.add(item);
    }

    public List<T> findWithLowerPrice(int maxPrice) {
        return items.stream().filter(item -> item.getPrice() < maxPrice).toList();
    }

    public List<T> findByCategory(Category category) {
        return items.stream().filter(item -> item.getCategory() == category).toList();
    }

    public Optional<T> findByName(String name) {
        return items.stream().filter(item -> item.getName().equals(name)).findFirst();
    }

    public Optional<T> removeItem(String name) {
        return items.stream().filter(item -> item.getName().equals(name)).findFirst().map(item -> {
            items.remove(item);
            return item;
        });
    }

    public List<T> getItems() {
        return items;
    }
}

