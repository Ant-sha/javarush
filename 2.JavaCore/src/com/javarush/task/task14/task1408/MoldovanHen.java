package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen{
    String getDescription(){
        String info= super.getDescription() + " Моя страна - "+Country.MOLDOVA + ". Я несу "+ getCountOfEggsPerMonth() +" яиц в месяц.";
        return info;
    }
    @Override
    int getCountOfEggsPerMonth() {
        return 67;
    }
}
