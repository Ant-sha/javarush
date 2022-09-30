package com.javarush.task.task19.task1919;

/*
Считаем зарплаты

В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] — String, [значение] — double. [имя] и [значение] разделены пробелом.

Для каждого имени посчитать сумму всех его значений.
Все данные вывести в консоль, предварительно отсортировав в возрастающем порядке по имени.
Закрыть потоки.

Пример входного файла:
Петров 2
Сидоров 6
Иванов 1.35
Петров 3.1

Пример вывода:
Иванов 1.35
Петров 5.1
Сидоров 6.0
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;

public class Solution {
    public static void main(String[] args) throws IOException {
        String filename = args[0];
        FileReader fileReader = new FileReader(filename);
        BufferedReader br = new BufferedReader(fileReader);
        TreeMap<String, Double> bill = new TreeMap<>();
        Matcher m = null;
        while (br.ready()) {
            String[] tmp = br.readLine().split("\\s");
            if (bill.containsKey(tmp[0])) {
                bill.put(tmp[0], bill.get(tmp[0]) + Double.parseDouble(tmp[1]));
            } else {
                bill.put(tmp[0], Double.parseDouble(tmp[1]));
            }
        }
        for (Map.Entry<String,Double> pare: bill.entrySet()) {
            System.out.println(pare.getKey()+" "+pare.getValue());
        }
        br.close();
    }
}
