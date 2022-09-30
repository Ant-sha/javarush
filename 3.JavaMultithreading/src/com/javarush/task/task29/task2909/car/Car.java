package com.javarush.task.task29.task2909.car;

import java.util.Date;

public abstract class Car {
    static public final int TRUCK = 0;
    static public final int SEDAN = 1;
    static public final int CABRIOLET = 2;

    double fuel;

    public double summerFuelConsumption;
    public double winterFuelConsumption;
    public double winterWarmingUp;

    private int type;

    private boolean driverAvailable;
    private int numberOfPassengers;

    protected Car(int type, int numberOfPassengers) {
        this.type = type;
        this.numberOfPassengers = numberOfPassengers;
    }

    public void fill(double numberOfLiters) throws Exception {
        if (numberOfLiters < 0)
           throw new Exception();
        fuel += numberOfLiters;

    }

//    public double getTripConsumption(Date date, int length, Date SummerStart, Date SummerEnd) {
//        double consumption;
//        if (date.before(SummerStart) || date.after(SummerEnd)) {
//            consumption = length * winterFuelConsumption + winterWarmingUp;
//        } else {
//            consumption = length * summerFuelConsumption;
//        }
//        return consumption;
//    }

//    public int getNumberOfPassengersCanBeTransferred() {
//        if (!isDriverAvailable())
//            return 0;
//        if (fuel <= 0)
//            return 0;
//
//        return numberOfPassengers;
//    }

    public boolean isDriverAvailable() {
        return driverAvailable;
    }

    public void setDriverAvailable(boolean driverAvailable) {
        this.driverAvailable = driverAvailable;
    }

    public void startMoving() {



        if (getNumberOfPassengersCanBeTransferred() > 0) fastenPassengersBelts();
        fastenDriverBelt();


    }
    


    public void fastenPassengersBelts() {
    }

    public void fastenDriverBelt() {
    }

    public abstract int getMaxSpeed() ;



    public boolean isSummer(Date date, Date summerStart, Date summerEnd){
        if((date.after(summerStart))&&(date.before(summerEnd)))
            return true;
        else
            return false;
    }
    private boolean canPassengersBeTransferred(){
        if(isDriverAvailable() &&fuel>0){
            return true;
        }else
            return false;

    }
    public int getNumberOfPassengersCanBeTransferred(){

      if(canPassengersBeTransferred()){
          return this.numberOfPassengers;
      } else return 0;
    }

    public double getWinterConsumption(int length){
      return winterFuelConsumption*length+winterWarmingUp;
    }
    public double getSummerConsumption(int length){
        return summerFuelConsumption*length;
    }

    public double getTripConsumption(Date date, int length, Date summerStart, Date summerEnd){
        if (isSummer(date,summerStart,summerEnd))
            return getSummerConsumption(length);
        else
            return getWinterConsumption(length);
    }

    public static Car create(int type, int numberOfPassengers){
        switch (type) {
            case 0 : return new Truck(numberOfPassengers);
            case 1: return new Sedan(numberOfPassengers);
            case 2: return new Cabriolet(numberOfPassengers);
            default: return new Sedan(numberOfPassengers);
        }



    }

}