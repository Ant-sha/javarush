package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {


                List <Integer> MGS = new ArrayList <>();
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                for (int i = 0; i < 10; i++) {
                    int a = Integer.parseInt(reader.readLine());
                    MGS.add(a);
                }
                int a = 0;
                int k = 0;
                while (true) {
                    if (MGS.get(k+1).equals(MGS.get(k))) {
                        a++;
                    }
                    k++;
                    if (k == 9) {
                        break;
                    }
                }
                System.out.println(a);
            }
        }

