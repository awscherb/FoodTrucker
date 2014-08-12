package com.awscherb.foodtrucker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class FoodTrucker {

    /** To retrieve data */
    private FoodTruckURLParser parser;
    /** To keep track of the schedule */
    private ConcurrentHashMap<FoodTruck, FoodTruck> trucks;

    ///////////////////////////////////////////////////////////////////////////

    public FoodTrucker() {
        parser = new FoodTruckURLParser();
        parser.getData();
        trucks = new ConcurrentHashMap<FoodTruck, FoodTruck>();
    }

    // Data methods

    /**
     * Gets the schedule from the parser, sets up data 
     */
    public void getSchedule() {
        Elements elm = parser.getElements();

        for (Element e : elm) {
            createTruckFromElement(e);
        }
    }

    /**
     * Return a ScheduleLocation object based on the given element
     * @param e the element
     * @return the ScheduleLocation
     */
    private void createTruckFromElement(Element e) {

        // Get the data
        String vendor = e.getElementsByAttributeValue("class", "com")
                .text();
        String dayOfWeek = e.getElementsByAttributeValue("class", "dow")
                .text();
        String meal = e.getElementsByAttributeValue("class", "tod").text();
        String loc = e.getElementsByAttributeValue("class", "loc").text();


        // Create the necessary objects
        FoodTruck truck = new FoodTruck(vendor);
        Scheduling sched = new Scheduling();
        sched.setDay(Day.getDay(dayOfWeek));
        sched.setLocation(loc);
        sched.setMeal(Meal.getMealFromString(meal));

        // update old truck value
        if (trucks.containsKey(truck)) {
            FoodTruck oldTruck = trucks.get(truck);
            oldTruck.addScheduling(sched);
            trucks.put(truck, oldTruck);
        }

        // add new truck value
        else { 
            truck.addScheduling(sched);
            trucks.put(truck, truck);
        }

    }
    
    public ArrayList<FoodTruck> getAllTrucks() {
        for (FoodTruck g : trucks.values()) {
            g.sortSchedule();
        }
        ArrayList<FoodTruck> truckList = 
                new ArrayList<FoodTruck>(trucks.values());
        Collections.sort(truckList);
        
        return truckList;
        
    }


}
