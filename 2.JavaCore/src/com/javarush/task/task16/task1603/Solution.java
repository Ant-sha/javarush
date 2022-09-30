package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {


        SpecialThread specialobj1=new SpecialThread();
        SpecialThread specialobj2=new SpecialThread();
        SpecialThread specialobj3=new SpecialThread();
        SpecialThread specialobj4=new SpecialThread();
        SpecialThread specialobj5=new SpecialThread();
        list.add(new Thread(specialobj1));
        list.add(new Thread(specialobj2));
        list.add(new Thread(specialobj3));
        list.add(new Thread(specialobj4));
        list.add(new Thread(specialobj5));
        }

        //Add your code here - добавьте свой код тут


    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
