package com.javarush.task.task05.task0532;

import java.io.*;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       final int n= Integer.parseInt(reader.readLine());

       /* int maximum= Integer.MIN_VALUE;


        if(n>0){
            for (int i = 0; i < n; i++) {
                int aktuall= Integer.parseInt(reader.readLine());
                if(aktuall>maximum){
                    maximum=aktuall;
                }

                
            }
        }
        System.out.println(maximum);
*/




        int[]  arr= new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
            Arrays.sort(arr);

            System.out.println(arr[n-1]);




}}
