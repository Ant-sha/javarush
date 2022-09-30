package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFatherName =reader.readLine();
        Cat catgrandFather =new Cat(grandFatherName, null,null);

        String grandMotherName =reader.readLine();
        Cat catgrandMother =new Cat(grandMotherName, null,null);

        String fatherName= reader.readLine();
        Cat catFather =new Cat(fatherName,null,catgrandFather);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName,catgrandMother,null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName,catMother,catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName,catMother,catFather);

        System.out.println(catgrandFather);
        System.out.println(catgrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat father;
        private Cat mother;

        /*Cat(String name) {
         *   this.name = name;
        *}

        *Cat(String name, Cat parent) {
         *   this.name = name;
          *  this.parent = parent;
        *}
        *
        * */
        Cat(String name,  Cat mother, Cat father){
            this.name= name;
            this.father=father;
            this.mother=mother;
        }

        @Override
        public String toString() {
            if (father == null&& mother == null)
                return "The cat's name is " + name + ", no mother, no father ";
            else if(father==null&& mother!=null)
                return "The cat's name is " + name + " mother is "+mother.name+" , no father" ;

            else if(father!=null && mother==null)
                return "The cat's name is " +name+ " , no mother "+ " father is "+father.name;

            else
                return "The cat's name is " + name + ", mother is " + mother.name+ " father is "+father.name;
        }
    }

}
