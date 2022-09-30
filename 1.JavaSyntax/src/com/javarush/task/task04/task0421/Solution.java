package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;
import java.util.Arrays;
import java.lang.String;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc1=new Scanner(System.in);
        String a=sc1.nextLine();
        Scanner sc2=new Scanner(System.in);
        String b=sc2.nextLine();
        if(a.equals(b)){
            System.out.println("Имена идентичны");
              }
        else if(a.length()==b.length()){
            System.out.println("Длины имен равны");
        }
}}
