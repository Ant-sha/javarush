package com.javarush.task.task11.task1114;

/* 
Все мировые религии
Изменить три класса: Judaism (Иудаизм), Christianity (Христианство), Islam (Мусульманство).
Унаследовать христианство от иудаизма и мусульманство от христианства.


Требования:
1. В классе Solution должен быть public класс Judaism (Иудаизм).
2. В классе Solution должен быть public класс Christianity (Христианство).
3. В классе Solution должен быть public класс Islam (Мусульманство).
4. Класс Christianity должен быть унаследован от класса Judaism.
5. Класс Islam должен быть унаследован от класса Christianity.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Judaism {

    }

    public class Christianity extends Judaism{

    }

    public class Islam extends  Christianity{

    }

}
