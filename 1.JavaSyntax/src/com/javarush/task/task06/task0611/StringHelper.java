package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        String result = s+s+s+s+s;
        //напишите тут ваш код
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        for(int i=0;count>i;count--){
            result+=s;//напишите тут ваш код
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(multiply("abc"));
        System.out.println(multiply("abc",7));
    }
}
