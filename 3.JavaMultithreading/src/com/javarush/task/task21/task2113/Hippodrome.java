package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses = new ArrayList<Horse>();
public static Hippodrome game=null;
    public Hippodrome() {
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void run() throws InterruptedException {
        for (int i = 0; i <100 ; i++) {
            move();
            Thread.sleep(200);
            print();
        }
    }
    public  void print(){

        horses.forEach(horse->{horse.print();});
        for (int i = 0; i <10 ; i++) {
            System.out.println();
        }
    }
    public void move(){
        //for (Horse horse : horses) { horse.move(); }

        //horses.stream().forEach(Horse::move);

        horses.forEach(horse -> {horse.move();});

    }
    public Horse getWinner(){
      // double maxDistance = 0;
        //String name = null;

        //for (Horse horse : horses ){
//          // if(horse.distance>maxDistance){
//               maxDistance=horse.distance;
//           name=horse.name;
//       }}return  horse;


            return horses.stream().max(Comparator.comparing(Horse::getDistance))
                    .orElse(null);



    }
    public void printWinner(){
        //System.out.println("Winner is "+ Horse.getName()+"!");
        System.out.printf("Winner is %s!", getWinner().name);
    }



    public static void main(String[] args) throws InterruptedException {



            game = new Hippodrome(new ArrayList<Horse>());
        //for (int i = 0; i < 3; i++) {
           // Horse horse = new Horse("a", 3, 0);
          //  horses.add(new Horse("Bur" + i, 3, 0));
       // Horse horse1 = new Horse("имя_лошади", 3, 0);
        //horses = new ArrayList<>();
        //horses.add(horse1);
        //  }
        game.horses.add(new Horse("Sila", 10, 0));
        game.horses.add(new Horse("Sila2", 3, 0));
        game.horses.add(new Horse("Sila3", 3, 600));
 game.run();
        game.getWinner();
        game.printWinner();

    }
}
