package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.sql.Array;
import java.util.Arrays;

/* 
Совершенствуем функциональность
Совершенствуем функциональность
Текущая реализация: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.


Требования:
1. Программа должна считывать числа с клавиатуры.
2. В классе должен быть метод public static void main.
3. В классе должен быть метод public static min, принимающий 5 параметров типа int.
4. Метод min должен возвращать минимум из 5 переданных чисел. Если минимальных чисел несколько - вернуть любое из них.
5. Программа должна выводить строку, которая начинается на "Minimum = ".
6. Программа должна выводить строку, которая заканчивается минимальным из 5 введенных чисел.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr= new int[5];
        for(int i=0; i<5;i++) {
            arr[i] = Integer.parseInt((reader.readLine()));
        }



        System.out.println(min(arr));
        /*for (int i = 0; i < arr.length-1; i++) {
            System.out.println(arr[i]);
        }*/


        /*int a = Integer.parseInt(reader.readLine());


        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());
*/
       // int minimum = min(a, b);

       // System.out.println("Minimum = " + minimum);
    }


    public static int min(int[] arr) {
       int min=arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if(min>arr[i]) min=arr[i];

        }return min;
          }
          }
