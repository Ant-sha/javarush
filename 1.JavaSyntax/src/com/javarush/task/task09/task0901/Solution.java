package com.javarush.task.task09.task0901;

/* 
Возвращаем StackTrace
*/

import com.sun.security.jgss.GSSUtil;

public class Solution {
    public static void main(String[] args) throws Exception{

        method1();
    }

    public static   StackTraceElement[] method1() {
        method2();
        StackTraceElement[] stackTraceElements=Thread.currentThread().getStackTrace();
        for(StackTraceElement element : stackTraceElements)
        {
            System.out.println(element.getMethodName());
        }


        return  stackTraceElements;//напишите тут ваш код
    }

    public static   StackTraceElement[] method2() {
        method3();
        StackTraceElement[] stackTraceElements=Thread.currentThread().getStackTrace();
for(StackTraceElement element : stackTraceElements){
    System.out.println(element.getMethodName());
}
        return  stackTraceElements;//напишите тут ваш код
    }

    public static   StackTraceElement[] method3() {
        method4();
        StackTraceElement[] stackTraceElements=Thread.currentThread().getStackTrace();
        for(StackTraceElement element : stackTraceElements){
            System.out.println(element.getMethodName());
        }

        return  stackTraceElements;//напишите тут ваш код
    }

    public static  StackTraceElement[] method4() {
        method5();
        StackTraceElement[] stackTraceElements=Thread.currentThread().getStackTrace();
        for(StackTraceElement element : stackTraceElements){
            System.out.println(element.getMethodName());
        }
        return  stackTraceElements; //напишите тут ваш код
    }

    public static StackTraceElement[] method5() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements)
        {
            System.out.println(element.getMethodName());
        }
        return stackTraceElements;//напишите тут ваш код
    }
}
