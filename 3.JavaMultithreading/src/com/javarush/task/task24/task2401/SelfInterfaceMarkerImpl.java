package com.javarush.task.task24.task2401;

public class SelfInterfaceMarkerImpl implements  SelfInterfaceMarker{
    public void open(){
        System.out.println("hello");

    }
    public void close(){
        System.out.println("byebye");
    }
}
