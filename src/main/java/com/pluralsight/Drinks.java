package com.pluralsight;

public class Drinks {
    private String flavor;
    private double price;
    private String size;

    public Drinks(String flavor, double price, String size) {
        this.flavor = flavor;
        this.price = price;
        this.size = size;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
