package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        // напишите тут ваш код
        for (int i = 0; i < array.length; i++) {
            String sCur = array[i];
            int nPos = i;

            if (isNumber(sCur)) {
                int nMax = Integer.parseInt(sCur);
                for (int j = i + 1; j < array.length; j++) {
                    if (isNumber(array[j]) && Integer.parseInt(array[j]) > nMax) {
                        nMax = Integer.parseInt(array[j]);
                        nPos = j;
                    }
                }
            } else {
                String sMax = sCur;
                for (int j = i + 1; j < array.length; j++) {
                    if (!isNumber(array[j]) && isGreaterThan(sMax, array[j])) {
                        sMax = array[j];
                        nPos = j;
                    }
                }
            }

            if (i != nPos) {
                String sTmp = array[i];
                array[i] = array[nPos];
                array[nPos] = sTmp;
            }
        }
    }


    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {                return false;
            }
        }
        return true;
    }
}
