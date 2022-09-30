package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat(int age,int weight,int strength) {

    this.age=age;
    this.weight=weight;
    this.strength=strength;
    }

    public boolean fight(Cat anotherCat) {
       if(this.weight>anotherCat.weight && this.age>anotherCat.age && this.strength> anotherCat.strength){
           return true;}
       else return false;//напишите тут ваш код
    }

    public static void main(String[] args) {
          Cat cat1=new Cat(10,5,5);
          Cat cat2=new Cat(11,6,7);
          System.out.println(cat1.fight(cat2));

    }
}
