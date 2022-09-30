package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public  static int even;
    public static int odd;
    public static int nums;
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String n= reader.readLine();
          for(int i=0; i<n.length();i++){
             nums= Integer.parseInt(n.substring(i,i+1));
             if(nums%2==0) {
                 even++;
             } else odd++;
          }
          System.out.println("Even: " +even+ " Odd: " +odd);

       // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
         //String num = bufferedReader.readLine();
        // for (int i = 0; i <num.length() ; i++) {
        // nums = Integer.parseInt(num.substring(i,i+1));
        // System.out.println("Even: "+nums);
        // if (nums%2==0) { even++; } else odd++; }
        // int a = even; int b = odd;
        // System.out.println("Even: "+a+" Odd: "+b);

        //напишите тут ваш код
    }
}
