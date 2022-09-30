package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
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
        if (a==b && b==c && c==a)
            System.out.println(a +" "+b+ " "+ c);
        else {if(a==b)
            System.out.println(a+" "+b);
        if(b==c)
            System.out.println(b+" "+ c);
        if(c==a)
            System.out.println(c+" "+a);}
        //напишите тут ваш код
    }
}