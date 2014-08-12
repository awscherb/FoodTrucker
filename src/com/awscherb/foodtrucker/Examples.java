package com.awscherb.foodtrucker;



public class Examples {


    public static void main(String[] args) {
        FoodTrucker f = new FoodTrucker();
        f.getSchedule();

//        for (FoodTruck g : f.getAllTrucks()) {
//            System.out.println(g);
//        }

        System.out.println(f.getCurrentTrucks());
        //        System.out.println(f.getAllTrucks().size());

    }

}
