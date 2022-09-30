package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int x = 1;
        int y = 1;
        while (x <= 10) {
            System.out.print(x + " ");
            while (y <= 9) {
                y++;
                System.out.print(x * y + " ");
            }
            x++;
            y = 1;
            System.out.println("");
        }
    }
}



























/*
        int i=1;
        int y=1;
        while(i<11) {
            System.out.print(i*y + " ");

            while(y<11){

            System.out.print(y*i + " ");
            y++;i++;
            System.out.println("");}}
        }

*/
//напишите тут ваш код




