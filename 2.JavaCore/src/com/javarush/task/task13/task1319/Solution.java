package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.Scanner;

/* 
Писатель в файл с консоли
*/


        public class Solution {
            public static void main(String[] args) throws IOException {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                File  file = new File(reader.readLine());
                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                while (true)
                {
   String gut=reader.readLine();
                    bufferedWriter.write(gut+"\n");
                    if (gut.equals("exit")) break;


                }
                bufferedWriter.close();
                reader.close();
                fileWriter.close();
                // напишите тут ваш код
            }
        }

