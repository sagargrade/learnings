package com.techgig.code.gladiator;

import java.util.*;

public class FineMaxNumberOfRideWithGivenMoney {
    public static void main(String[] args) {
//        int leftSideRide = 6;
//        int[] leftSideRidePrice = { 5, 3, 6, 8, 10, 20};
//        int rightSideRide = 8;
//        int[] rightSideRidePrice = { 4, 4, 4, 6, 7, 10, 4, 8 };
//        int amountOfMoney = 20;

        int leftSideRide = 4;
        int[] leftSideRidePrice = { 10,20,30,40};
        int rightSideRide = 9;
        int[] rightSideRidePrice = { 5,3,9,10,2,3,6,9,15 };
        int amountOfMoney = 60;

        Map<Integer, Integer> frequencyMap = new TreeMap<>();
        for(int value : leftSideRidePrice){
            frequencyMap.put(value, frequencyMap.getOrDefault(value, 0) + 1);
        }
        for(int value : rightSideRidePrice){
            frequencyMap.put(value, frequencyMap.getOrDefault(value, 0) + 1);
        }
        System.out.println(frequencyMap);
        int numberOfRides = countMaxNumberRideOnGivenMoney(frequencyMap, amountOfMoney);
        System.out.println(numberOfRides);
    }

    private static int countMaxNumberRideOnGivenMoney(Map<Integer, Integer> frequencyMap, int amountOfMoney) {
        int totalSum = 0;
        int numberOfRides = 0;
        List<Integer> previousKeys = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()){
           totalSum += entry.getKey() * entry.getValue();
           if (totalSum <= amountOfMoney){
               numberOfRides += entry.getValue();
               previousKeys.add(entry.getKey());
           } else {
               int difference = totalSum - amountOfMoney;
               if (!previousKeys.contains(difference)){

               }
           }
        }
        return numberOfRides;
    }

}
