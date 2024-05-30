package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private List<Toppings> toppings;
    private String breadType;
    private int size;
    private boolean toasted;


    public Sandwich(int size, boolean toasted, String breadType) {
        this.size = size;
        this.toasted = toasted;
        this.breadType = breadType;
        this.toppings = new ArrayList<Toppings>();
    }

    public void addTopping(Toppings toppings) {
        this.toppings.add(toppings);


    }

    public List<Toppings> getToppings() {
        return toppings;
    }

    public void setToppings(List<Toppings> toppings) {
        this.toppings = toppings;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }



}




