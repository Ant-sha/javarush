package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = null;
        BufferedInputStream buffer = null;
        BufferedReader reader=null;


            Scanner scanner=new Scanner(System.in);
            String scannerStr=scanner.next();
            BufferedReader suka=new BufferedReader(new InputStreamReader(System.in));
            inputStream = new FileInputStream(scannerStr);

            buffer = new BufferedInputStream(inputStream);
suka.close();
            while(buffer.available()>0) {

                char c = (char)buffer.read();

                System.out.print(c);
        }
            try{buffer.close();
            inputStream.close();
            reader.close();}catch(Exception e){};

        }



    }
