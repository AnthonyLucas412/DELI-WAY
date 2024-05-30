package com.pluralsight;

import java.util.ArrayList;

public abstract class  Toppings {
    private String name;
    private String toppingType;
    private boolean isExtra;

    public Toppings(String name, String toppingType, boolean isExtra) {
        this.name = name;
        this.toppingType = toppingType;
        this.isExtra = isExtra;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getToppingType() {
        return toppingType;
    }

    public void setToppingType(String toppingType) {
        this.toppingType = toppingType;
    }

    public boolean isExtra() {
        return isExtra;
    }

    public void setExtra(boolean extra) {
        isExtra = extra;
    }
}