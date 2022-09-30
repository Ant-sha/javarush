package com.javarush.task.task09.task0908;

/* 
Исключение при работе со строками
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
       try{
           System.out.println("wird ausgeührt");
           String s = null;
           String m = s.toLowerCase();
           System.out.println("появлюсь если не выпадет ошибки");
       }
       catch(NullPointerException ex){
           System.out.println("NullPointerException");
       }


        //напишите тут ваш код
    }
}
