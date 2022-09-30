package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int numSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();
        //add your code here - добавь код тут
    }

    public static class RacingClock extends Thread {
       //int numSeconds=5;
        public RacingClock() {
            start();
        }

        public void run() {

try{
            while(1<=numSeconds) {
                                System.out.print(" "+ numSeconds +" ");
                                numSeconds--;

                    Thread.sleep(1000);}

}
                catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println("Прервано!");
                    return;
                }
            System.out.print(" Марш! ");
           }//add your code here - добавь код тут
        }
    }

