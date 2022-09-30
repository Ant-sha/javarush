package com.javarush.task.task28.task2801;



    class MainClass {
        	Object message(){
                 		return "Hello!";
                 	}
 	public static void main(String[] args) {
                 		System.out.print(new MainClass().message());
                 		System.out.print(new Main2().message());
                 	}
 }
 class Main2 extends MainClass {
 	String message(){
                 		return "World!";
                 	}
 }







