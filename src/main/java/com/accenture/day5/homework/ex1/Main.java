package com.accenture.day5.homework.ex1;

public class Main {
    public static void main(String[] args) {
        Shop<Clothes> clothesShop = new Shop<>();
        clothesShop.addItem(new Clothes("Shirt", 10, Category.NEW));
        clothesShop.addItem(new Clothes("Shirt", 10, Category.NEW));
        clothesShop.addItem(new Clothes("Shirt", 10, Category.NEW));
        clothesShop.addItem(new Clothes("Shirt", 10, Category.NEW));
        clothesShop.addItem(new Clothes("Shirt", 10, Category.NEW));
        clothesShop.addItem(new Clothes("Shirt", 10, Category.NEW));

        var electronicsShop = new Shop<Electronics>();
        electronicsShop.addItem(new Electronics("TV", 10, Category.ON_SALE));
        electronicsShop.addItem(new Electronics("Phone", 13, Category.REFURBISHED));
        electronicsShop.addItem(new Electronics("Phone", 15, Category.NEW));

        electronicsShop.findByName("Phone").ifPresentOrElse(System.out::println, () -> System.out.println("Not found"));
        electronicsShop.findByName("TV").ifPresentOrElse(System.out::println, () -> System.out.println("Not found"));
        electronicsShop.removeItem("Laptop").ifPresentOrElse(System.out::println, () -> System.out.println("Not found"));

        System.out.println(electronicsShop.findWithLowerPrice(15));
        System.out.println(electronicsShop.findByCategory(Category.NEW));


    }

}
