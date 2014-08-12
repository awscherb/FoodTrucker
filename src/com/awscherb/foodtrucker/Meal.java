package com.awscherb.foodtrucker;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public enum Meal {
    
    BREAKFAST(8, 10),
    LUNCH(10, 15),
    DINNER(15, 23),
    LATE(23, 24);

    private final int startHour;
    private final int endHour;
    
    private Meal(int s, int e) {
        this.startHour = s;
        this.endHour = e;
    }
    

    public static Meal getMeal(long milli) {
        Calendar now = Calendar.getInstance();
        int hour = now.get(Calendar.HOUR_OF_DAY);
        
        if (BREAKFAST.startHour <= hour && hour < BREAKFAST.endHour) {
            return BREAKFAST; }
        if (LUNCH.startHour <= hour && hour < LUNCH.endHour) {
            return LUNCH; }
        if (DINNER.startHour <= hour && hour < DINNER.endHour) {
            return DINNER; }
        if (LATE.startHour <= hour && hour < LATE.endHour) {
            return LATE; }
        
        return null;
    }
    
    public static Meal getMealFromString(String m) {
        if (m.equalsIgnoreCase("breakfast")) { return BREAKFAST; }
        if (m.equalsIgnoreCase("lunch")) { return LUNCH; }
        if (m.equalsIgnoreCase("dinner")) { return DINNER; }
        if (m.equalsIgnoreCase("Late Night")) { return LATE; }

        else return null;
    }
    
    public String toString() {
        String end = this.name().substring(1);
        String begin = this.name().substring(0,1);
        String out = "";
        out += begin + end.toLowerCase();
        return out;
    }
}
