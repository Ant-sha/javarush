package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.MIN_VALUE;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
int sumEven=0;
int sumOdd=0;
        int numbers[]=new int[15];
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < numbers.length; i++) {
            String s=reader.readLine();

            numbers[i]=Integer.parseInt(s);

        }
        for (int i = 0; i < numbers.length; i++) {
            if(i%2==0){
                sumEven+=numbers[i];

            }else
                sumOdd+=numbers[i];

        }
        if(sumEven<sumOdd) {


            System.out.println("В домах с нечетными номерами проживает больше жителей.");}
        else{
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }//напишите тут ваш код
    }
}
