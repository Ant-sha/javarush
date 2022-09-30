package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);

        int a= sc.nextInt();
        Scanner sc2 =new Scanner(System.in);
        int b = sc2.nextInt();
        Scanner sc3 = new Scanner(System.in);
        int c = sc3.nextInt();

        if((a+b)>c && (a+c)>b && (b+c)>a)
            System.out.println("Треугольник существует.");
        else
            System.out.println("Треугольник не существует.");
        //напишите тут ваш код
    }
}