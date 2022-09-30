package com.javarush.task.task16.task1616;
import java.math.BigInteger;
public class Big {
BigInteger sum=BigInteger.valueOf(1);
 BigInteger calc(){
for(int i=0;i<64;i++){
    sum=sum.multiply(BigInteger.valueOf(2));
    //sum= sum.add(sum);
    }return sum;}

    public static void  main(String[] args) {
     Big b=new Big();
     System.out.println(b.calc());
    }


}
