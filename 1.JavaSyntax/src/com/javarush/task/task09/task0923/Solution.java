package com.javarush.task.task09.task0923;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String abc = reader.readLine();
        char[] c = abc.toCharArray();

        ArrayList<Character> glasnije = new ArrayList<Character>();
        ArrayList<Character> soglasnie = new ArrayList<Character>();
        for (int i = 0; i < c.length; i++) {
            if (isVowel(c[i])) {glasnije.add(c[i]);}
            else {soglasnie.add(c[i]);}
        }




        glasnije.forEach((Character el ) -> System.out.print(el+" "));
        System.out.println(" ");
       // soglasnie.forEach((Character el) -> System.out.print(el + " "));
    char z =' ';
        for (int i=0; i<soglasnie.size(); i++)
    {
        if (!soglasnie.get(i).equals(z))
         System.out.print(soglasnie.get(i)+" ");
    }}


        //напишите тут ваш код


        // метод проверяет, гласная ли буква
        public static boolean isVowel ( char c){
            c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
            for (char d : vowels) {  // ищем среди массива гласных
                if (c == d) {
                    return true;
                }
            }
            return false;
        }
    }