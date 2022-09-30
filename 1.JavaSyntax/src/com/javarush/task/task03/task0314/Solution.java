package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {

        for (int i = 1; i <= 1000; i++) {
            for (int y = 1; y <= 1000; y++) {
                System.out.print(i * y + " ");
            }
            System.out.println();

        }
    }
}
