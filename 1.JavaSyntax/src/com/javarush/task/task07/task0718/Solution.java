package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list= new ArrayList<String>(10);

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<10;i++){
            list.add(reader.readLine());
        }
        for(int i=0; i<9;i++){


            int one = list.get(i).length();
            int two = list.get(i+1).length();
            if (one > two) { System.out.println(i+1);
            break;
            }
        }


        //напишите тут ваш код
    }
}

