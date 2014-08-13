package com.awscherb.foodtrucker;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Represents a scheduling of one or more food trucks, at a specific
 * time and location
 * @author Alex Scherb
 * @version 1.0
 */
public class Scheduling implements Comparable<Scheduling> {
    
    private String location;
    private Meal meal;
    private Day day;
    private FoodTruck truck;   
    private GPSPoint point;

    public void setLocation(String location) {
        this.location = location;
        this.point = LocationService.TABLE.get(location);
    }

    public GPSPoint getPoint() {
        return this.point;
    }
    
    public FoodTruck getTruck() {
        return this.truck;
    }


    public void setMeal(Meal meal) {
        this.meal = meal;
    }



    public void setDay(Day day) {
        this.day = day;
    }



    public void setTruck(FoodTruck truck) {
        this.truck = truck;
    }



    /**
     * Get the meal this is for
     * @return the meal
     */
    public Meal getMeal() {
        return meal;
    }

    /**
     * Get the location this is for
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    
    public Day getDay() {
        return this.day;
    }

    public String toString() {
        String result = "";
        result += 
                meal.toString() + " on "
              + day.toString() + " at "
              + location;
              
        return result;
    }


    @Override
    public int compareTo(Scheduling o) {
        return (this.day.ordering + this.meal.ordinal())
                - (o.day.ordering + o.meal.ordinal());   
    }
    
    
}
