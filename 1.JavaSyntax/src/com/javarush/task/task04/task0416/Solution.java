
      package com.javarush.task.task04.task0416;

/*
Переходим дорогу вслепую
*/

import java.io.BufferedReader;

import java.io.InputStreamReader;

        public class Solution {
            public static void main(String[] args) throws Exception {
                //напишите тут ваш код
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String n = reader.readLine();
                double t = Double.parseDouble(n);
                if(t % 5 < 3 & t % 5 >= 0)
                    System.out.println("зелёный");
                else if(t % 5 < 4 && t % 5 >= 3)
                    System.out.println("жёлтый");
                else if(t % 5 >= 4 && t % 5 < 5)
                    System.out.println("красный");
            }
        }