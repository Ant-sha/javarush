package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/

public class Solution {

    public static Map<String, String> runtimeStorage = new HashMap<>();


    public static void save(OutputStream outputStream) throws Exception {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        for (String s1 : runtimeStorage.keySet()) {
            bufferedWriter.write(s1.replaceAll("\\s", "\\\\ ") + " = " + runtimeStorage.get(s1) + System.lineSeparator());
        }
        bufferedWriter.close();
    }

    public static void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод

        Properties prop = new Properties();
        prop.load(inputStream);
        for (Map.Entry<Object, Object> x: prop.entrySet()) {
            runtimeStorage.put((String)x.getKey(),(String)x.getValue());
        }
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fos = new FileInputStream(reader.readLine())) {
            load(fos);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(runtimeStorage);
    }
}
