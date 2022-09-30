package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.io.BufferedReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a= Integer.parseInt(reader.readLine());


       if(a>0){ a*=2;
        System.out.println(a);}
        else if(a<0) {++a;
        System.out.println(a);}
        else {
            System.out.println(0);/*

if (a > 0) System.out.println(a* 2);
else if (a < 0) System.out.println(a + 1);
else System.out.println(0);*/
}}}
