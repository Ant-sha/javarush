package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner a1= new Scanner(System.in);
        String name = a1.nextLine();
        Scanner a2 = new Scanner(System.in);
        short sum1 = a2.nextShort();
        Scanner a3 = new Scanner(System.in);
        short sum2 = a3.nextShort();

        System.out.println(name+ " получает " + sum1+ " через "+ sum2+ " лет.");

        //напишите тут ваш код
    }
}
