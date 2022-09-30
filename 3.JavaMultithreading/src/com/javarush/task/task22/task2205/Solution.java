package com.javarush.task.task22.task2205;

/* 
МНЕ нравится курс JavaRush
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(String.format(getFormattedString(), "JavaRush", "курс", "мне", "нравится"));
        //должен быть вывод
        //"МНЕ нравится курс JavaRush"
    }

    public static String getFormattedString() {
        //formatter.format("%4$2s %3$2s %2$2s %1$2s", "a", "b", "c", "d")
        // -> " d  c  b  a"
        //template=%s+%s+%s;
        return "%3$S %4$s %2$s %1$s";
    }
}
