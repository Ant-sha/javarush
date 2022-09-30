package com.javarush.task.task09.task0921;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {

            ArrayList<Integer> vvod= new ArrayList<>();
        BufferedReader buff= new BufferedReader(new InputStreamReader(System.in));
        while (true){
            try{
            int a = Integer.parseInt(buff.readLine());
            vvod.add(a);}
        catch(NumberFormatException | IOException e){
                for (int x: vvod){
                    System.out.println(x);
                }break;
        }


        //напишите тут ваш код
    }
}}
