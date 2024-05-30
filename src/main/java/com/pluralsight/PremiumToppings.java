package com.pluralsight;

public class PremiumToppings extends Toppings {
    private double price;
    private int sandwichSize;

    public PremiumToppings(String name, String toppingType, boolean isExtra, double price, int sandwichSize) {
        super(name, toppingType, isExtra);
        this.price = price;
        this.sandwichSize = sandwichSize;
    }










