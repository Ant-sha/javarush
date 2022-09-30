package com.javarush.task.task14.task1421;

public final class Singleton {
    private static Singleton instance=null;

    /*private  Singleton(Singleton single_instance){
        this.single_instance=single_instance;
    }*/

    private Singleton()
    {

    }

    public static Singleton getInstance()
    {
        // To ensure only one instance is created 
        if (instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }




    }

