package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        int length = 3;
        int countPos = 0;
        int countNeg = 0;
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        for (int i = 0; i < length; i++) {
            int n = Integer.parseInt(reader.readLine());
            if (n > 0) countPos++;
            if (n < 0) countNeg++;
        }
        System.out.println("количество отрицательных чисел: " + countNeg);
        System.out.println("количество положительных чисел: " + countPos);


    }}








        /*







        int a, b, c;

        Scanner input = new Scanner(System.in);

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();//напишите тут ваш код
int x=0;
        if(a<0){
            sout
        }







        if (a>0&&b>0&&c>0){
    int z=0;
    int y=3;
    System.out.println("количество отрицательных чисел: "+z);
    System.out.println("количество положительных чисел: "+y);
    }
if(a<0&&b<0&&c<0){
    int z=3;
    int y =0;
    System.out.println("количество отрицательных чисел: "+z);
    System.out.println("количество положительных чисел: "+y);
  }
if(a==0&b==0&&c==0){
    int z=0;
    int y=0;
    System.out.println("количество отрицательных чисел: "+z);
    System.out.println("количество положительных чисел: "+y);
}
if(a>0&&b>0&&c<0||a>0&&b<0&&c>0||a<0&&b>0&&c>0){
    int z=1;
    int y=2;
    System.out.println("количество отрицательных чисел: "+z);
    System.out.println("количество положительных чисел: "+y);
}


if (a>0&&b<0&&c<0){
    int z=2;
    int y=1;
            System.out.println("количество отрицательных чисел: "+z);
            System.out.println("количество положительных чисел: "+y);
        }


}}
*/