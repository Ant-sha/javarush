package com.javarush.task.task18.task1802;

import java.io.FileInputStream;
import java.util.Scanner;/*
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner sc=new Scanner(System.in);
        String filename= sc.nextLine();

        FileInputStream f=new FileInputStream(filename);
        int min=0;
        if(f.available()>0){
            min=f.read();
        }

        while(f.available()>0){
            int value=f.read();
            if(value<min)
                min=value;
        }
f.close();
        System.out.println(min);
    }
}
