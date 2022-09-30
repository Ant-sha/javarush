package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen{
    String getDescription(){
        String info= super.getDescription() + " Моя страна - "+Country.UKRAINE + ". Я несу "+ getCountOfEggsPerMonth() +" яиц в месяц.";
        return info;
    }
    @Override
    int getCountOfEggsPerMonth() {
        return 98;
    }
}
