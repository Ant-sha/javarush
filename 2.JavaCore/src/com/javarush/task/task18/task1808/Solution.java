package com.javarush.task.task18.task1808;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
/*
Разделение файла

Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать большую часть.
Закрыть потоки.

Требования:
1. Программа должна три раза считать имена файлов с консоли.
2. Для чтения из файла используй поток FileInputStream, для записи в файлы - FileOutputStream
3. Первую половину байт из первого файла нужно записать во второй файл.
4. Вторую половину байт из первого файла нужно записать в третий файл.
5. Потоки FileInputStream и FileOutputStream должны быть закрыты.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc1=new Scanner(System.in);


        String file1=sc1.nextLine();
        String file2=sc1.nextLine();
        String file3=sc1.nextLine();

        FileInputStream fileInputStream1=new FileInputStream(file1);
        FileOutputStream fileOutputStream2=new FileOutputStream(file2);
        FileOutputStream fileOutputStream3=new FileOutputStream(file3);
        int filesize=fileInputStream1.available();
        int part1size = filesize % 2==0 ? filesize / 2 :  filesize / 2 + 1;

        while(fileInputStream1.available()>0){
            byte[] buf1=new byte[part1size];
            byte[] buf2= new byte[filesize - part1size];


            fileInputStream1.read(buf1);
            fileInputStream1.read(buf2);
            fileOutputStream2.write(buf1);
            fileOutputStream3.write(buf2);

        }

        fileInputStream1.close ();
        fileOutputStream2.close ();
        fileOutputStream3.close ();






    }
}
