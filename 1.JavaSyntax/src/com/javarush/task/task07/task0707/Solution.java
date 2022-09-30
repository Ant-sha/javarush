package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       ArrayList<String> list= new ArrayList<String>(5);
list.add(0,"abc");
list.add(1,"abcd");
list.add(2,"abcdef");
list.add(3,"abcdefg");
list.add(4,"abcdefgh");

        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++)
        {

            System.out.println( list.get(i) );
        }



        //напишите тут ваш код
    }
}
