package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        int length =3;
        int[] nums= new int[length];
        BufferedReader buff= new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<length;i++ ){
            nums[i] =Integer.parseInt(buff.readLine());}
        Arrays.sort(nums);
        System.out.println(nums[length -1]+" "+nums[length-2]+" "+nums[length-3]);
        //напишите тут ваш код
    }
}
