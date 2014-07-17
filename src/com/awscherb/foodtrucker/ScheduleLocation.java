package com.awscherb.foodtrucker;

import java.util.Collection;

public class ScheduleLocation {
    
    /** Time of deal, i.e. "10AM - 3PM"  */
    private String time;
    /** Meal of the day */
    private String meal;
    /** Location of the truck */
    private String location;
    /** Collection of trucks at that location */
    private Collection<FoodTruck> trucks;

}
