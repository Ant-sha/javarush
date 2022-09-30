package com.javarush.task.task18.task1803;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner sc= new Scanner(System.in);
        String filename= sc.nextLine();

        FileInputStream f=new FileInputStream(filename);

        HashMap<Integer,Integer> mapOfByte = new HashMap<Integer,Integer>();
        int value =0;
        Integer count=0;
        while(f.available()>0){
            value=f.read();
            count=mapOfByte.get(value);
            if (count!=null)
                count++;
            else
                count=0;
            mapOfByte.put(value,count);
        }

        boolean first =true;
        int max=0;
        for( int amountByte : mapOfByte.values()){
            if(first){
                max=amountByte;
                first=false;
            }
            if(max<amountByte)
                max=amountByte;

        }

        for(Map.Entry pair: mapOfByte.entrySet()){
            if(max==(int) pair.getValue())
                System.out.print(" " + pair.getKey());

        }
f.close();

    }
}
