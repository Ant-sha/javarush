package com.javarush.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Меняем функциональность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        ArrayList<String> newList = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            int a = list.get(i).length();
            if (a % 2 == 0)
                newList.add(i, s + " " + s);
            else newList.add(i, s + " " + s + " " + s);

        }

        for (int i = 0; i < newList.size(); i++) {
            System.out.println(newList.get(i));
        }
    }}
//ArrayList<String> listMultiplier = new ArrayList<>();
//
//        for (String s : list) {
//            if (s.length() % 2 == 0) {
//                listMultiplier.add(String.join(" ", Collections.nCopies(2, s)));
//            } else {
//                listMultiplier.add(String.join(" ", Collections.nCopies(3, s)));
//            }
//        }
//
//listMultiplier.forEach(System.out::println);
