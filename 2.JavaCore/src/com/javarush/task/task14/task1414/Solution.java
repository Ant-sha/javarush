package com.javarush.task.task14.task1414;

/* 
MovieFactory
*/


import java.util.Scanner;

public class Solution  {
    public static void main(String[] args) throws Exception {
        //ввести с консоли несколько ключей (строк), пункт 7
        Scanner sc = new Scanner(System.in);

        Movie movie = null;

        //while ( key.matches("cartoon| thriller| soapOpera")) {
          // while ((movie = MovieFactory.getMovie(key)) != null) {
            while(true){
                String key = sc.nextLine();

               movie = MovieFactory.getMovie(key);
               if(movie!=null) System.out.println(movie.getClass().getSimpleName());
else break;
            }

        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */

        }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }
            if("thriller".equals(key)){
                movie=new Thriller();
            }
            if("cartoon".equals(key)){
                movie=new Cartoon();
            }

            //напишите тут ваш код, пункты 5,6

            return movie;
        }
    }


    static abstract class Movie {}
    static class Cartoon extends Movie{}
    static class SoapOpera extends Movie {  }
        static class Thriller extends Movie {  }

    //Напишите тут ваши классы, пункт 3
}
