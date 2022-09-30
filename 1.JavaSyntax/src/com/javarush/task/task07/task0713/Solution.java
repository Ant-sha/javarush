package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> mainlist= new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();
        ArrayList<Integer>  list2= new ArrayList<>();
        ArrayList<Integer>  listother= new ArrayList<>();//напишите тут ваш код



        for(int i=0;i<20;i++)
        {BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
            String s= reader.readLine();
            mainlist.add(Integer.parseInt(s));
        }
        for (int i = 0; i < mainlist.size(); i++) {
            if(mainlist.get(i)%3==0|| mainlist.get(i)%3==0&&mainlist.get(i)%2==0) list3.add(mainlist.get(i));
            if(mainlist.get(i)%2==0|| mainlist.get(i)%2==0&&mainlist.get(i)%3==0) list2.add(mainlist.get(i));
            if(mainlist.get(i)%3!=0&&mainlist.get(i)%2!=0) listother.add(mainlist.get(i));
        }
    printList(list3);

        printList(list2);

        printList(listother);
    }


    public static void printList(List<Integer> name  ) {
        for (Integer integer : name) {
             System.out.println(integer);

        }

        } //напишите тут ваш код
    }
/*for (int i = 0; i < 20; i++) {
            int num = Integer.parseInt(reader.readLine());
            mainList.add(num);
            if (num%3==0 || (num%3==0 && num%2==0)) subListA.add(num);
            if (num%2==0 || (num%2==0 && num%3==0)) subListB.add(num);
            if (!(num%3==0) && !(num%2==0)) subListC.add(num);
        }
*/