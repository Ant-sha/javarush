


package com.javarush.task.task08.task0818;

        import java.util.HashMap;
        import java.util.Iterator;
        import java.util.Map;

/*
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<>();
        map.put("Nico",5070);
        map.put("Fedor",150);
        map.put("Arik",1600);
        map.put("xzcc",50);
        map.put("zxcccc",5000);
        map.put("qwe",5100);
        map.put("ewr",53);
        map.put("kjg",5000);
        map.put("dfj",57);
        map.put("Egor",599);
        return map;
    }





    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> pair = iterator.next();
            String key = pair.getKey();
            Integer value = pair.getValue();
            if(value < 500)
                iterator.remove();
        }
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
