package com.awscherb.foodtrucker;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class FoodTruckURLParser {
    
    private static final String FT = 
            "http://www.cityofboston.gov/foodtrucks/schedule-app-min.asp";

    
    public void getData(String[] args) {
            org.jsoup.nodes.Document d;
            try {
                d = Jsoup.connect(FT).get();
                Elements trucks = d.getElementsByTag("tr");
                for (Element e : trucks) {
                    
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
  
    }
    
    
    public static String convertTruckElementToString(Element e) {
        String result = "";
        String vendor = e.getElementsByAttributeValue("class", "com").text();
        String dayOfWeek = e.getElementsByAttributeValue("class", "dow").text();
        String meal = e.getElementsByAttributeValue("class", "tod").text();
        String loc = e.getElementsByAttributeValue("class", "loc").text();
        result += vendor + ": " + dayOfWeek + ", " + meal + " at " + loc;
        return result;
        
    }
}
