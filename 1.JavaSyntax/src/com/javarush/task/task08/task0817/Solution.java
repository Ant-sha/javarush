package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/*
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Nico", "schmidt");
        map.put("Nico", "luka");
        map.put("Arik","paul");
        map.put("xzcc","kuda");
        map.put("zxcccc","zelo");
        map.put("qwe","lubi");
        map.put("ewr","wasya");
        map.put("kjg","moto");
        map.put("dfj","quqa");
        map.put("Egor","bedor");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
           //removeItemFromMapByValue();


    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        createMap();


    }
}
