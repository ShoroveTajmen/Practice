package com.practice;

public class Main {

    public static void main(String[] args) {
//        Bicycle bicycle = new Bicycle(0,0,0);
//
//        System.out.println(bicycle.toString());
//
//        bicycle.setCadence(30);
//        bicycle.setGear(2);
//        bicycle.speedUp(10);
//
//        System.out.println(bicycle.toString());
//
//        bicycle.applyBreak();
//        bicycle.applyBreak();
//
//        System.out.println(bicycle.toString());

        MountainBike mountainBike = new MountainBike(0,0,0,4);

        // java.lang.System
        System.out.println(mountainBike.toString());

        mountainBike.setSeatHeight(6);
        mountainBike.setCadence(20);
        mountainBike.setGear(3);
        mountainBike.speedUp(25);

        System.out.println(mountainBike.toString());

        mountainBike.applyBreak();

        System.out.println(mountainBike.toString());

    }
}
