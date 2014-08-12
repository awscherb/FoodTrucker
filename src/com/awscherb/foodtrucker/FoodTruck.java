package com.awscherb.foodtrucker;

import java.util.ArrayList;
import java.util.Collections;

public class FoodTruck implements Comparable<FoodTruck> {

    private String name;
    private ArrayList<Scheduling> schedule;

    public FoodTruck(String name) {
        this.name = name;
        this.schedule = new ArrayList<Scheduling>();
    }

    /**
     * Add the given Scheduling to this truck's list of schedulings.
     * <br>Also add this truck to the given Scheduling object.
     * @param s the Scheduling to add
     */
    public void addScheduling(Scheduling s) { 
        this.schedule.add(s);
        s.setTruck(this);
    }

    public ArrayList<Scheduling> getSchedule() {
        return this.schedule;
    }

    public String getName() {
        return this.name;
    }

    protected void sortSchedule() {
        Collections.sort(this.schedule);
    }

    public boolean equals(Object o) {
        if (o instanceof FoodTruck) {
            FoodTruck f = (FoodTruck)o;
            return f.name.equals(this.name);
        }
        else return false;
    }

    public String toString() {
        return this.name + ": " + this.schedule.toString();
    }

    @Override
    public int compareTo(FoodTruck o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    public FoodTruck getScheduleAtInstant(Day today, Meal meal) {
        FoodTruck out = new FoodTruck(this.name);
        for (Scheduling s : this.schedule) {
            if (s.getDay().equals(today)
                    && s.getMeal().equals(meal)) {
                out.addScheduling(s);
            }
        }
        if (out.schedule.isEmpty()) {
//            out.addScheduling(new ClosedScheduling());
        }
        return out; 
    }




}
