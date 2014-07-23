package com.awscherb.foodtrucker;

public class FoodTruck {
    
    private String name;

    public FoodTruck(String name) {
        this.name = name;
    }
    
    public boolean equals(Object o) {
        if (o instanceof FoodTruck) {
            FoodTruck f = (FoodTruck)o;
            return f.name.equals(this.name);
        }
        else return false;
    }
    
    public String toString() {
        return this.name;
    }
    
}
