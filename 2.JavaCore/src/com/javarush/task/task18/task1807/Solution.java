package com.javarush.task.task18.task1807;

import java.io.FileInputStream;
import java.util.Scanner;
/*
Подсчет запятых
Подсчет запятых
С консоли считать имя файла.
Посчитать в файле количество символов ',', количество вывести на консоль.
Закрыть потоки.

Подсказка:
нужно сравнивать с ascii-кодом символа ','.


Требования:
1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль должно выводится число запятых в считанном файле.
4. Поток чтения из файла должен быть закрыт.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String fileName=sc.nextLine();
        FileInputStream inputStream=new FileInputStream(fileName);

        int count=0;
        while(inputStream.available()>0){
            if(inputStream.read()==44)
                count++;
        }
        System.out.println(count);
        inputStream.close();


    }
}
