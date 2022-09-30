package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String abc = reader.readLine();
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader2.readLine());

        //int n = reader2.read();
        while(n>0){

            System.out.println(abc);
            n--;
        }

        //напишите тут ваш код

    }
}
