package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {//1
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {//2
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    public static void printMatrix(short m,short n, Integer value){//3
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
        }

    public static void printMatrix(byte m,byte n, boolean value){//4
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);

    }

    public static void printMatrix(short m,short n, String value){//5
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
            }

    public static void printMatrix(long m,long n, Double value){//6
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Double) value);
    }
    public static void printMatrix( long m,long n, Float value){//7
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Float) value);
    }

    public static void printMatrix( byte m,long n, String value){//8
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (String) value);
    }
    public static void printMatrix( long m,byte n, Float value){//9
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Float) value);
    }
    public static void printMatrix( short m,long n, Float value){//10
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Float) value);
    }

}
