package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
      /*
        while (true) {
    int number = считываем число;
    if (проверяем, что number -1)
        break;
}//напишите тут ваш код
         */
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
int count=0;
double sum=0;
double mid;
        while(true){
            int number= Integer.parseInt(reader.readLine());
            if(number==-1) {
                break;}

                sum = sum + number;
count++;

            }
        System.out.println(sum/count);

   }
}

