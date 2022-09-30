package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;



public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if (a % 4 == 0 && (a % 100 != 0 || a % 400 == 0)){int x=366;
            System.out.println("количество дней в году: "+x);//напишите тут ваш код
    }   else {
            int x = 365;
            System.out.println("количество дней в году: " + x);
        }
}}