package com.javarush.task.task25.task2502;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Машину на СТО не повезем!
*/

public class Solution {
    public static enum Wheel {
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }

    public static class Car {
        protected List<Wheel> wheels;

        public Car() throws Exception {
            wheels = new ArrayList<>();

            String[] strings = loadWheelNamesFromDB();
            if (strings.length == 4) {
                for (String str : strings) {
                    wheels.add(Wheel.valueOf(str));
                }
            } else {

                throw new Exception();
            }
        }

        //init wheels here


        protected String[] loadWheelNamesFromDB() {
            //this method returns mock data
            return new String[]{"FRONT_LEFT", "FRONT_RIGHT", "BACK_LEFT", "BACK_RIGHT"};
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println(Arrays.toString(new Car().loadWheelNamesFromDB()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
