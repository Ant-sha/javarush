package com.javarush.task.task08.task0801;

public class Aufgabe3blatt5 {
    public static void main(String args[]){
        long x=1;
        long y= 1;
        long z=1;
        for(int n=0; n<30000;n++){
           x=y+z;
           y=x+3*z;
           z=y-x;
        }
        System.out.println("x30000 = "+x);
        System.out.println("y30000 = "+y);
        System.out.println("z30000 = "+z);
    }
}
