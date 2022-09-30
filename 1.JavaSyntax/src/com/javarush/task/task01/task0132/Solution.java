package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
          int i1 = number/100;
          int i2 = (number-(i1*100))/10;

          int i3 =  (number- (i1*100)-(i2*10));
          return (i1+i2+i3); //напишите тут ваш код


        /*int per1 = number / 100;
        *int per2 = (number - (per1 * 100))/10;
        *int per3 = number - (per1*100) - (per2*10);
        *return per1 + per2 + per3;
*/
    }
}