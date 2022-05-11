package com.accenture.day3.homework.ex3ex4;

public class Main {
    public static void main(String[] args) {
        var product1 = new Product("Mountain Bike", 134.99, 20, "Bicycle");
        var product2 = new Product("Touring Bike", 150.0, 30, "Bicycle");
        var product3 = new Product("Freestyle/Park Snowboard", 80.0, 0, "Snowboard");

        System.out.println("Product1 name: " + product1.getName());
        System.out.println("Product1 price: " + product1.getPrice() + " €");
        System.out.println("Product1 quantity: " + product1.getQuantity() + " pcs");
        System.out.println("Product1 category: " + product1.getCategory() );
        System.out.println("Has product1 stock: " + product1.hasStock());

        String requiredCategory = "Bicycle";
        System.out.println("Is product3 in category " + requiredCategory + ": " + product3.isInCategory(requiredCategory));
    }
}
