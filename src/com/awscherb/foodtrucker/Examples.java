package com.awscherb.foodtrucker;



public class Examples {


    public static void main(String[] args) {
//        FoodTrucker f = new FoodTrucker();
//        f.getSchedule();

//        for (FoodTruck g : f.getAllTrucks()) {
//            System.out.println(g);
//        }

        System.out.println(Meal.getTimeframe(Meal.getMeal(System.currentTimeMillis())));
        //        System.out.println(f.getAllTrucks().size());

    }

}
