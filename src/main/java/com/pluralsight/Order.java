package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int ID;
    private Customer customer;
    private List<Sandwich> sandwiches;
    private List<Chips> chips;
    private List<Drinks> drinks;

    public Order(int ID, Customer customer) {
        this.ID = ID;
        this.customer = customer;
        this.sandwiches = new ArrayList<>();
        this.chips = new ArrayList<>();
        this.drinks = new ArrayList<>();
    }

    public Order() {

    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public void addSandwich(Sandwich sandwich){
        this.sandwiches.add(sandwich);
    }
    public void addChips(Chips chips){
        this.chips.add(chips);
    }
    public void addDrinks(Drinks drinks){
        this.drinks.add(drinks);
    }

    public double getSmallSandwichCount() {
        return 0;
    }

    public double getMediumSandwichCount() {
        return 0;
    }

    public double getLargeSandwichCount() {
        return 0;
    }

    public double getSmallDrinkCount() {
        return 0;
    }

    public double getMediumDrinkCount() {
        return 0;
    }

    public double getLargeDrinkCount() {
        return 0;
    }

    public double getChipsCount() {
        return 0;
    }

}

