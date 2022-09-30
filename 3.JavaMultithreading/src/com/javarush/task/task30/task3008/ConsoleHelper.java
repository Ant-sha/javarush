package com.javarush.task.task30.task3008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {
    private static BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));


    public static void  writeMessage(String message){
        System.out.println(message);
    }

   public  static String readString() {
    String s="";
    try {
        s = bufferedReader.readLine();
    } catch(IOException e){
        System.out.println("Произошла ошибка при попытке ввода текста. Попробуйте еще раз.");
        return readString();
    }
     return s;
    }

    public  static int readInt() {
        int i=Integer.MAX_VALUE;
        try{
            i=Integer.parseInt(readString());
        } catch (NumberFormatException e ){
            System.out.println("Произошла ошибка при попытке ввода числа. Попробуйте еще раз.");
            return readInt();
        }
       return i;
    }


}
