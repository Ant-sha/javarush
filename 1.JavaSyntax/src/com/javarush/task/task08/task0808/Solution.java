package com.javarush.task.task08.task0808;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static java.lang.Runtime.getRuntime;

/* 
10 тысяч удалений и вставок
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // ArrayList
        long start = System.currentTimeMillis();





        ArrayList arrayList = new ArrayList(10000);
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        // LinkedList
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
        long end = System.currentTimeMillis();

        NumberFormat formatter = new DecimalFormat("#0.00000");
       // System.out.println("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");
    }

    public static void insert10000(List list) {
        for(int i=9999;i>-1;i--){
            list.add(0,1);//напишите тут ваш код
        }

    }

    public static void get10000(List list) {
        for(int i=9999;i>-1;i--)
            list.get(0);//напишите тут ваш код

    }

    public static void set10000(List list) {
        for(int i=9999; i>-1;i--)
            list.set(i,2);
       // System.out.println(getRuntime());//напишите тут ваш код

    }

    public static void remove10000(List list) {
        for(int i=9999; i>-1; i--)
            list.remove(i);//напишите тут ваш код

    }


}
