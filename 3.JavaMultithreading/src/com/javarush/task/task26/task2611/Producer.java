package com.javarush.task.task26.task2611;

import java.util.concurrent.ConcurrentHashMap;

public class Producer implements Runnable {
    public Producer(ConcurrentHashMap<String, String> map) {
        this.map = map;
    }

    private ConcurrentHashMap<String, String> map;
    @Override
    public void run() {
    try {
        int i=1;
        while (true) {
            map.put(String.valueOf(i),"Some text for "+i);
            i++;
            Thread.sleep(500);
        }
    } catch (InterruptedException e) {
        System.out.println(String.format("[%s] thread was terminated", Thread.currentThread().getName()));
    }
//    public void run() {
//        while (true){
//
//            try{
//                int i = 1;
//                map.put(String.valueOf(i),String.format("Some text for "+i));
//                i++;
//                Thread.sleep(500);
//            }catch (InterruptedException e){
//                System.out.println(String.format("[%s] thread was terminated", Thread.currentThread().getName()));
//                break;
//            }
//        }
//
//    }
}}
