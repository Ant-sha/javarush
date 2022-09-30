package com.javarush.task.task05.task0501;

/* 
Создание кота
*/

public class Cat {
    String name;
    int age;
    int weight;
    int strength;




    public Cat(String name, int age, int weight, int strength ){
       this.name=name;
       this.age=age;
       this.weight=weight;
       this.strength=strength;
    }
    //напишите тут ваш код

    public static void main(String[] args) {
        Cat cat=new Cat("Vaska",4,4,5);

    }
}
