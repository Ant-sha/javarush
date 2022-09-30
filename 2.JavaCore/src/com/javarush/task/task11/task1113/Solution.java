package com.javarush.task.task11.task1113;

/* 
Играем в Дарвина
Изменить четыре класса: Fish (Рыба), Animal (Животное), Ape (Обезьяна), Human (Человек).
Унаследовать животное от рыбы, обезьяну от животного и человека от обезьяны.


Требования:
1. В классе Solution должен быть public класс Fish (Рыба).
2. В классе Solution должен быть public класс Animal (Животное).
3. В классе Solution должен быть public класс Ape (Обезьяна).
4. В классе Solution должен быть public класс Human (Человек).
5. Класс Animal должен быть унаследован от класса Fish.
6. Класс Ape должен быть унаследован от класса Animal.
7. Класс Human должен быть унаследован от класса Ape.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Fish {

    }

    public class Animal extends Fish {

    }

    public class Ape extends Animal{

    }

    public class Human extends Ape{

    }

}
