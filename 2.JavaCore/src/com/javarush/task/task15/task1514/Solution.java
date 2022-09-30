package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static{
        labels.put(1.0,"privet");
        labels.put(2.0,"poka");
        labels.put(3.0,"2048");
        labels.put(440.9, "koloyar");
        labels.put(13.3,"osvobodili rus matushku");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
