package com.awscherb.foodtrucker;

import java.util.ArrayList;
import java.util.Collection;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class FoodTrucker {

    /** To retrieve data */
    private FoodTruckURLParser parser;
    /** To keep track of the schedule */
    private ArrayList<ScheduleLocation> schedule;
    
    ///////////////////////////////////////////////////////////////////////////
    
    
    public FoodTrucker() {
        parser = new FoodTruckURLParser();
        parser.getData();
        schedule = new ArrayList<ScheduleLocation>();
    }
    
    // Data methods
    
    /**
     * Gets the schedule from the parser, sets up data 
     */
    public void getSchedule() {
       Elements elm = parser.getElements();
       
       for (Element e : elm) {
           ScheduleLocation loc =
                   createScheduleLocationFromElement(e);
           schedule.add(loc);
       }
    }
    
    /**
     * Return the schedule
     * @return
     */
    public Collection<ScheduleLocation> getAllScheduleLocation() {
        return this.schedule;
    }
    
    /**
     * Return a ScheduleLocation object based on the given element
     * @param e the element
     * @return the ScheduleLocation
     */
    private ScheduleLocation createScheduleLocationFromElement(Element e) {
        
        // Get the data
        String vendor = e.getElementsByAttributeValue("class", "com")
                .text();
        String dayOfWeek = e.getElementsByAttributeValue("class", "dow")
                .text();
        String meal = e.getElementsByAttributeValue("class", "tod").text();
        String loc = e.getElementsByAttributeValue("class", "loc").text();
        
        // Create the necessary objects
        FoodTruck truck = new FoodTruck(vendor);
        ScheduleLocation sched = new ScheduleLocation();
        sched.addTruck(truck);
        sched.setLocation(loc);
        sched.setMeal(meal);
        sched.setTime(meal);
        sched.setDayOfWeek(dayOfWeek);
        
        return sched;
    }
    

}
