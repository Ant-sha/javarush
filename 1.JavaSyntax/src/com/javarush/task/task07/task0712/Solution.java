/**package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


//Самые-самые


public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<String> list=new ArrayList<>();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <10; i++) {
            list.add(reader.readLine());

        }


        for (int i = 0; i < list.size(); i++){
            for(int j=i+1;j<list.size();j++)
                if(list.get(j).length()<list.get(j).length()) {
                    String s = list.get(j);
                    list.set(i, s);


                    if (list.get(i).length() < list.get(j).length())
                        System.out.println(list.get(i));


                }else         }
        //напишите тут ваш код
    }
}
*/