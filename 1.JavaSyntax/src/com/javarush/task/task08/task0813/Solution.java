package com.javarush.task.task08.task0813;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static Set<String> createSet() {
        //напишите тут ваш код
        String[] massWordsL = {"Лиса", "ЛЛиса", "Лис", "Лор", "Лапать", "Лопата", "Лапоть", "Лыко", "Лань", "Лопух",
                "Лодырь", "Ландыш", "Лаванда", "Лох", "Лавр", "Лапочка", "Ласточка", "Лэптоп", "Лампа", "Лампочка"};
        Set<String> WordsL = new HashSet<String>(Arrays.asList(massWordsL));
        return WordsL;
    }

    public static void main(String[] args) {
        createSet();
    }
}



