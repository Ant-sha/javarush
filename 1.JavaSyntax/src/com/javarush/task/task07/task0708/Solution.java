/*package com.javarush.task.task07.task0708;
*
*import java.io.BufferedReader;
*import java.io.InputStreamReader;
*import java.util.ArrayList;
*import java.util.List;
*
*
*Самая длинная строка
*
*
*public class Solution {
 *   private static ArrayList<String> strings = new ArrayList<>(5);
*
*
 *   public static void main(String[] args) throws Exception {
*
 *       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  *      for (int i = 0; i < 5; i++) {
   *         strings.add(reader.readLine());}
*
*            int max = strings.get(0).length();
*int j=0;
  *          for (int i = 0; i < strings.size(); i++) {
   *             if (max <= strings.get(i).length()) {
    *                max = strings.get(i).length();
     *               //i = j;// хочу запомнить индекс элемента с макс. длиной
      *              String s = strings.get(i);
*
*
*                if (s.length() == max) {
  *                  System.out.println(s);
   *             }}
    *        }
*
*
 *       }
  *      //напишите тут ваш код
   * }*/
package com.javarush.task.task07.task0708;

        import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.util.ArrayList;
        import java.util.List;

/*
Самая длинная строка
*/

public class Solution {
    private static List<String> strings = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        //strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int x = 0; x < 5; x++) {
            strings.add(reader.readLine());//напишите тут ваш код
        }
        for (int x = 0; x <5; x++) {
            for (int z = x + 1; z < strings.size(); z++) {
                if (strings.get(z).length() < strings.get(x).length()) {
                    String q = strings.get(z);
                    strings.set(z, strings.get(x));
                    strings.set(x, q);
                }
            }
        }
        //  System.out.println(strings.get(2));

        for (int x = 0; x < strings.size(); x++) {
            if (strings.get(x).length() == strings.get(4).length())
                System.out.println(strings.get(x));
        }

    }
}