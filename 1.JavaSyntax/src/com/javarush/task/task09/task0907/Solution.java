package com.javarush.task.task09.task0907;

/* 
Исключение при работе с числами
*/

public class Solution {
    public static void main(String[] args) {
       try{
           System.out.println("Выполняюсь!");
           method1();//напишите тут ваш код
           System.out.println("появлюсь если не выпадет ошибки");
       }
       catch(ArithmeticException ex){
           System.out.println("yes i catch it ArithmeticException");
           
        }

        //напишите тут ваш код
    }

    public static void method1() {
        int a = 42 / 0;
    }
}
