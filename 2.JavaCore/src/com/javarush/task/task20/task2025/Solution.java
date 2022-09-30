//package com.javarush.task.task20.task2025;
//
//import java.util.*;
//
///*
//Алгоритмы-числа
//*/
//
//public class Solution {
//    static long[][] pow;
//
//    static {
//        pow = new long[][] {
//                {0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L},
//                {0L, 1L, 4L, 9L, 16L, 25L, 36L, 49L, 64L, 81L},
//                {0L, 1L, 8L, 27L, 64L, 125L, 216L, 343L, 512L, 729L},
//                {0L, 1L, 16L, 81L, 256L, 625L, 1296L, 2401L, 4096L, 6561L},
//                {0L, 1L, 32L, 243L, 1024L, 3125L, 7776L, 16807L, 32768L, 59049L},
//                {0L, 1L, 64L, 729L, 4096L, 15625L, 46656L, 117649L, 262144L, 531441L},
//                {0L, 1L, 128L, 2187L, 16384L, 78125L, 279936L, 823543L, 2097152L, 4782969L},
//                {0L, 1L, 256L, 6561L, 65536L, 1953125L, 1679616L, 5764801L, 16777216L, 43046721L},
//                {0L, 1L, 512L, 19683L, 262144L, 9765625L, 10077696L, 40353607L, 134217728L, 387420489L}
//        };
//    }
//
//    public static long[] getNumbers(long N) {
//        ArrayList<Long> longs = new ArrayList<>();
//
//        for (int i = 1; i < N; i++) {
//            long res = 0L;
//
//            String number = String.valueOf(i);
//
//            for (String integer : number.split("")) {
//                if (res > i) break;
//
//                int temp = Integer.parseInt(integer);
//
//                if (temp != 0)
//                    res += pow[number.length()-1][temp];
//            }
//
//            if (res == i) {
//                longs.add(res);
//            }
//        }
//
//        final long[] result = new long[longs.size()];
//        int ind = 0;
//
//        for (Long aLong : longs) {
//            result[ind++] = aLong;
//        }
//
//        return result;
//    }
//
//    public static void main(String[] args) {
//        long a = System.currentTimeMillis();
//        System.out.println(Arrays.toString(getNumbers(1000)));
//        long b = System.currentTimeMillis();
//        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
//        System.out.println("time = " + (b - a) / 1000);
//
//        a = System.currentTimeMillis();
//        System.out.println(Arrays.toString(getNumbers(1000000)));
//        b = System.currentTimeMillis();
//        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
//        System.out.println("time = " + (b - a) / 1000);
//    }
//}
package com.javarush.task.task20.task2025;

        import java.util.*;

/*
Алгоритмы-числа
*/

public class Solution {
//    static long[][] pow;
//
//    static {
//        pow = new long[][] {
//                {0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L},
//                {0L, 1L, 4L, 9L, 16L, 25L, 36L, 49L, 64L, 81L},
//                {0L, 1L, 8L, 27L, 64L, 125L, 216L, 343L, 512L, 729L},
//                {0L, 1L, 16L, 81L, 256L, 625L, 1296L, 2401L, 4096L, 6561L},
//                {0L, 1L, 32L, 243L, 1024L, 3125L, 7776L, 16807L, 32768L, 59049L},
//                {0L, 1L, 64L, 729L, 4096L, 15625L, 46656L, 117649L, 262144L, 531441L},
//                {0L, 1L, 128L, 2187L, 16384L, 78125L, 279936L, 823543L, 2097152L, 4782969L},
//                {0L, 1L, 256L, 6561L, 65536L, 1953125L, 1679616L, 5764801L, 16777216L, 43046721L},
//                {0L, 1L, 512L, 19683L, 262144L, 9765625L, 10077696L, 40353607L, 134217728L, 387420489L}
//        };
//    }
    public static long[] getNumbers(long N) {
        if (N <= 0) return new long[0];
        long[] result;
        long inputNumber = 8_999_999_999_999_999_999L; //это последнее уникальное натуральное число в диапазоне long
        if (N <= inputNumber) inputNumber = N; // если задать выше, то цикл уйдет в рекурсию
        ///////////////////////////////////////////////////////////////////////////////////
//степенная таблица. Ускоряет работу программы более чем в 2 раза
        Long[][] numberInDegree = new Long[11][20];
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 20; j++) {
                long res = i;
                for (int k = 1; k < j; k++) {
                    res = res * i;
                }
                numberInDegree[i][j] = res;
                //System.out.print(numbInDegree[i][j] + " ");
            }
            // System.out.println();
        }

//получаем список уникальных чисел и проверяем их на принадлежность числу Армстронга
        TreeSet<Long> ArmstrongNumbers = new TreeSet<>();
        int sizeOfNumber = (inputNumber + "").length();
        long mostMultiple = numberInDegree[10][sizeOfNumber-1];
        //(long) Math.pow(10, sizeOfNumber - 1);
        for (long i = 1; i < inputNumber; i++) {
            long copy = mostMultiple;
            long tempI = i;
            while (copy >= 10) {
                if (i % copy == 0) {
                    long tempMulti = 10;
                    while (tempMulti <= copy) {
                        i = i + ((tempI % (copy * 10)) / (tempMulti));
                        tempMulti = tempMulti * 10;
                    }
                }
                copy = copy / 10;
            }

            //получили уникальное число и проверяем его
            int sizeOfElement = (i + "").length();
            long mostMultipleOfElement = numberInDegree[10][sizeOfElement-1];
            long copyOfMostMultiple;
            //Цикл ниже должен повторятся пока степень возведения не станет равной размеру входящего числа
            //таким образом мы проверяем числа 07, 007, 037(которое как раз и станет 370 - числом Армстронга) и т.д.
            for (int j = sizeOfElement; j <= sizeOfNumber; j++) {
                long result1 = 0;
                copyOfMostMultiple = mostMultipleOfElement;
                while (copyOfMostMultiple >= 1) {
                    long digit = (i % (copyOfMostMultiple * 10)) / copyOfMostMultiple;
                    result1 = result1 + numberInDegree[(int) digit][j];
                    copyOfMostMultiple = copyOfMostMultiple / 10;
                }
                //result2 это сумма цифр result1 возведенная в степень длины result1 (для проверки)
                long result2 = 0;
                int sizeOfResult1 = (result1 + "").length();
                long anotherMulti = numberInDegree[10][sizeOfResult1-1];
                long tempResult1 = result1;
                while (anotherMulti >= 1) {
                    long digit2 = tempResult1/anotherMulti;
                    if (digit2<0) break;
                    result2 = result2 + numberInDegree[(int) digit2][sizeOfResult1];
                    tempResult1 = tempResult1%anotherMulti;
                    anotherMulti=anotherMulti/10;

                }
                // сравнение полученных чисел и добавление в TreeSet
                if (result2 == result1 && result1 < inputNumber && result1 != 0) ArmstrongNumbers.add(result1);
            }
        }
        //переводим значения в массив result
        result = new long[ArmstrongNumbers.size()];
        int index = 0;
        for (Long element : ArmstrongNumbers) {
            result[index] = element;
            index++;
        }
        return result;
    }

    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(Long.MAX_VALUE)));
        long b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);

        a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(-1)));
        b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);
    }
}
