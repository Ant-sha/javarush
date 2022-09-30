package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution implements Person {
    public static void main(String[] args) throws Exception {
        Person person = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {

            String key = reader.readLine();
            switch (key) {
                case ("coder"):
                    person = new Person.Coder();
                    break;
                case ("proger"):
                    person = new Person.Proger();
                    break;
                case ("loser"):
                    person = new Person.Loser();
                    break;
                case ("user"):
                    person = new Person.User();
                    break;
                                           }
if(person==null) break;
            /*
            while ((key = reader.readLine()).matches("user|loser|coder|proger"))
            if ( "coder".equals(key) ) new Coder();
        else if ( "proger".equals(key) ) new Proger();
        else if ( "loser".equals(key) ) new Loser();
        else if ( "user".equals(key) ) new User();
            // user.doWork();
        else if(anything.) break;}
*/


            //тут цикл по чтению ключей, пункт 1
            //создаем объект, пункт 2

        doWork(person);
        person=null;//вызываем doWork

    }}

    public static void doWork(Person person) {
        if(person instanceof Coder){
            ((Coder) person).writeCode();// пункт 3
        }
        if(person instanceof Loser){
            ((Loser) person).doNothing();
        }
        if(person instanceof User ){
            ((User) person).live();
        }
        if(person instanceof Proger){
            ((Proger)  person).enjoy();
        }
    }
}
