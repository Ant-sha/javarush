package com.javarush.task.task14.task1420;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution extends  Throwable{
    public static void main(String[] args)
    {
        Scanner scaner = new Scanner(System.in);
        int a,b,nod;
        a = scaner.nextInt();
        if(a <=0)
        {
            throw new InputMismatchException();
        }
        b = scaner.nextInt();
        if(b <= 0)
        {
            throw new InputMismatchException();
        }
        nod = a < b?a:b;
        for (; nod > 0; nod--)
        {
            if (a % nod == 0 && b % nod == 0)
                break ;
        }
        System.out.println(nod);
    }
}