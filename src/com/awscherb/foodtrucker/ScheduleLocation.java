package com.awscherb.foodtrucker;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Represents a scheduling of one or more food trucks, at a specific
 * time and location
 * @author Alex Scherb
 * @version 1.0
 */
public class ScheduleLocation {
    
    /** Time of deal, i.e. "10AM - 3PM"  */
    private String time;
    /** Day of the week */
    private String dayOfWeek;
    /** Meal of the day */
    private String meal;
    /** Location of the truck */
    private String location;
    /** Collection of trucks at that location */
    private ArrayList<FoodTruck> trucks;
    
    public ScheduleLocation() { 
        this.trucks = new ArrayList<FoodTruck>();
    }

    /**
     * Get the time
     * @return
     */
    public String getTime() {
        return time;
    }
    
    /**
     * Get the day of week
     * @return
     */
    public String getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * Get the meal this is for
     * @return the meal
     */
    public String getMeal() {
        return meal;
    }

    /**
     * Get the location this is for
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * Get all trucks for this schedule
     * @return the trucks
     */
    public Collection<FoodTruck> getTrucks() {
        return trucks;
    }

    /**
     * Set the time
     * @param time
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * Set the day of week
     * @param s
     */
    public void setDayOfWeek(String s) {
        this.dayOfWeek = s;
    }
    
    /**
     * Set the meal
     * @param meal
     */
    public void setMeal(String meal) {
        this.meal = meal;
    }

    /**
     * Set the location
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
    }
    
    /**
     * Add the given truck to this schedule location
     * @param t the truck to add
     */
    public void addTruck(FoodTruck t) {
        this.trucks.add(t);
    }

    /**
     * Remove the given truck from this schedule location, if it exists
     * @param t the truck to remove
     */
    public void removeTruck(FoodTruck t) {
        trucks.remove(t);
    }

    public String toString() {
        String result = "";
        result += trucks.get(0).toString()
                + ": " + getDayOfWeek() + ", "
                + getMeal() + " (" + getTime() + "), "
                + "at " + getLocation();
        return result;
    }
    
}
