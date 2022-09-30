package com.javarush.task.task16.task1615;
class solution2{
static class A {
    int number = 23;
    int getNumber() { return number; }
}
static class B extends A {
    int number = 42;
    void print1() { System.out.println(getNumber());}
    void print2() { System.out.println(number);}
    }

    public static void main(String[] args) {
       B b=new B();
       b.print1();
       b.print2();
    }  }