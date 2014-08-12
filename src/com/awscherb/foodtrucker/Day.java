package com.awscherb.foodtrucker;

public enum Day implements Comparable<Day> {
    
    // The following fields are so we can compare Day objects
    // and get the correct order for days of the week.
    
    MONDAY(0, "Monday"), 
    TUESDAY(10, "Tuesday"),
    WEDNESDAY(20, "Wednesday"),
    THURSDAY(30, "Thursday"),
    FRIDAY(40, "Friday"),
    SATURDAY(50, "Saturday"),
    SUNDAY(60, "Sunday");
    
    public int day;
    public String name;
    
    private Day(int i, String s) {
        this.day = i;
        this.name = s;
    }
   

    public static Day getDay(String s) {
        String day = s.trim();
        if (day.equalsIgnoreCase("monday")) { return MONDAY; }
        if (day.equalsIgnoreCase("tuesday")) { return TUESDAY; }
        if (day.equalsIgnoreCase("wednesday")) { return WEDNESDAY; }
        if (day.equalsIgnoreCase("thursday")) { return THURSDAY; }
        if (day.equalsIgnoreCase("friday")) { return FRIDAY; }
        if (day.equalsIgnoreCase("saturday")) { return SATURDAY; }
        if (day.equalsIgnoreCase("sunday")) { return SUNDAY; }
        else return null;
    }

    public String toString() {
        return this.name;
    }
    
}
