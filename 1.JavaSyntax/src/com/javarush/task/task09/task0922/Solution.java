package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/*
Какое сегодня число?


public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String stringDate=reader.readLine();
        Date date=new Date(stringDate);
        SimpleDateFormat sdf=new SimpleDateFormat("MMMM DD, YYYY", dateFormatSymbols );
        System.out.println(sdf.format(date).toUpperCase());

    }
    private static DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(){
        public String[] getMonths(){
            String[] str = {"JAN",
                    "FEB", "MAR", "APR",
                    "MAY", "JUN", "JUL",
                    "AUG", "SEP", "OCT",
                    "NOV", "DEC"};
            for(int i = 0; i<str.length; i++){
                str[i].toUpperCase();
            }
            return str;
        }
    };

        //напишите тут ваш код
    }


public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String s = reader.readLine();
        Date date=new Date(s);
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-mm-dd", Locale.ENGLISH);
        SimpleDateFormat sdf1 = new SimpleDateFormat("MMM dd, YYYY", Locale.ENGLISH);

        s = sdf.parse(date);
        String s2=sdf1.format(date);

        reader.close();

        System.out.println(sdf1.format(s2));}}

*/
public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Date date = sdf.parse(reader.readLine());

        SimpleDateFormat rdf = new SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH);

        System.out.println(rdf.format(date).toUpperCase());
    }
}
