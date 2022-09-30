package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        String[] Stringarray=new String[10];
        int[] Numberarray= new int[10];



        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < Stringarray.length; i++) {

            String s= reader.readLine();
            Stringarray[i]= s;

        }

        for (int i = 0; i < Numberarray.length; i++) {
            Numberarray[i]=Stringarray[i].length();

        }

        for (int i = 0; i < Numberarray.length; i++) {
            System.out.println(Numberarray[i]);

        }
        //напишите тут ваш код
    }
}
