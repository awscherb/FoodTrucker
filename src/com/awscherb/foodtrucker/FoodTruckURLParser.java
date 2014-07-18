package com.awscherb.foodtrucker;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class FoodTruckURLParser {
    
    /** URL which we get data from */
    private static final String FT = 
            "http://www.cityofboston.gov/foodtrucks/schedule-app-min.asp";

    /** All truck elements in the current schedule */
    private Elements truckElements;
    
    /**
     * Retrieve data from the URL, set elements
     */
    public void getData() {
            org.jsoup.nodes.Document d;
            try {
                d = Jsoup.connect(FT).get();
                Elements trucks = d.getElementsByTag("tr");
                truckElements = trucks;
            } catch (IOException e) { }
  
    }
    
    /**
     * Return the current truck elements
     * @return
     */
    public Elements getElements() {
        return this.truckElements;
    }
}
