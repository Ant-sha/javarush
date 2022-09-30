package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader adressreader=new BufferedReader(new InputStreamReader(System.in));
String filename=adressreader.readLine();
        adressreader.close();
        BufferedReader filecontent = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));

        ArrayList<Integer>  arrayList = new ArrayList<>();




        while (filecontent.ready()) {
            int number= Integer.parseInt(filecontent.readLine());
if(number%2==0){
    arrayList.add(number);}
           else if(number<0&number %2==0){ arrayList.add(number);}
        }
        filecontent.close();
        Collections.sort(arrayList);
        for (int x:arrayList)
              {
                  System.out.println(x);

        }







        }
        // напишите тут ваш код
    }

