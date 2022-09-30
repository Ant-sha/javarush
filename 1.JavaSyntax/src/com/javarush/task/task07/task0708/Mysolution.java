/**package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


        *Самая длинная строка


        public class Mysolution {
  private static ArrayList<String> strings = new ArrayList<>(5);


           public static void main(String[] args) throws Exception {

       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      for (int i = 0; i < 5; i++) {
         strings.add(reader.readLine());}

            int max = strings.get(0).length();
int j=0;
          for (int i = 0; i < strings.size(); i++) {
             if (max <= strings.get(i).length()) {
                 max = strings.get(i).length();
                 //i = j;// хочу запомнить индекс элемента с макс. длиной
                 String s = strings.get(i);
             }
                if (s.length == max) {
                  System.out.println(s);
             }}
        }

       }
      //напишите тут ваш код
 }*/