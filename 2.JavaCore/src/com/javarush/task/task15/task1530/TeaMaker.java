package com.javarush.task.task15.task1530;

import com.javarush.task.task15.task1530.DrinkMaker;

public class TeaMaker extends DrinkMaker {


    @Override
    public void getRightCup() {
        System.out.println("Берем чашку для чая");
    }

    @Override
    void putIngredient() {
        System.out.println("Насыпаем чай");
    }

    @Override
    void pour() {
        System.out.println("Заливаем кипятком");
    }
}
