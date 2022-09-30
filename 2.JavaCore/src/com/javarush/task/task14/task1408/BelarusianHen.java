package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen{
    String getDescription(){
        String info= super.getDescription() + " Моя страна - "+Country.BELARUS + ". Я несу "+ getCountOfEggsPerMonth() +" яиц в месяц.";
        return info;
    }

    @Override
    int getCountOfEggsPerMonth() {
        return 21;
    }
}
