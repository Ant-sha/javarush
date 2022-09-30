package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> words=new ArrayList<>();
         words.add(0, "мама");
        words.add(1,"именно");
         words.add(2,"мыла");
         words.add(3,"именно");
         words.add(4,"раму");
         words.add(5,"именно");

        for (String word : words) {
            System.out.println(word);

        }
        }//напишите тут ваш код
    }

