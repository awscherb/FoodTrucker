package com.awscherb.foodtrucker;



public class Examples {

    
    public static void main(String[] args) {
        FoodTrucker f = new FoodTrucker();
        f.getSchedule();
        
//        System.out.println(f.getAllScheduleLocation());
        
//        for (ScheduleLocation tr : f.getAllScheduleLocation()) {
//            System.out.println(tr);
//        }
        
        System.out.println(f.getByTruck(new FoodTruck("Cookie Monstah")));
        System.out.println(f.getByLocation("Rose Kennedy Greenway, Dewey "
                + "Square, South Station"));
        System.out.println(f.getByMeal("Lunch"));

        
    }

}
