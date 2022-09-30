package com.javarush.task.task26.task2601;

import java.util.Arrays;
import java.util.Comparator;

/*
Почитать в инете про медиану выборки
*/

public class Solution {

    public static void main(String[] args) {
        Integer[] array = {13, 8, 11, 14, 5, 16};
        sort(array);
    }

    public static Integer[] sort(Integer[] array) {
        Arrays.sort(array);
        int med = 0;
        int dev = array.length /2;
        if (array.length % 2 != 0) med = array[dev];
        else med = (array[dev-1] + array[dev]) / 2;


        Integer[] array1 = new Integer[array.length];
        for(int i = 0; i < array.length; i++){
            array1[i] = array[i] - med;

        }
        Comparator<Integer> compareByAbs = new Comparator<Integer>() {

            public int compare(Integer o1, Integer o2) {
                return Math.abs(o1) - Math.abs(o2);
            }
        };
        Arrays.sort(array1, compareByAbs);

        for(int i = 0; i < array.length; i++){
            array[i] = array1[i] + med;
            //           System.out.println(array1[i]);
        }

        return array;
    }
}