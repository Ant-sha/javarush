package com.javarush.task.task16.task1630;

public class Solution extends Thread {
    public static String firstFileName;
    public static String secondFileName;
    public static class ReadFileThread extends Thread implements ReadFileInterface {

        @Override
        public void setFileName(String fullFileName) {

        }

        @Override
        public String getFileContent() {
            return null;
        }

        //@Override
       // public void join() throws InterruptedException {

        }

        @Override
        public void start() {

        }

    //add your code here - добавьте код тут

















    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //add your code here - добавьте код тут
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }




    public static void main(String[] args) throws InterruptedException {
        //systemOutPrintln(firstFileName);
        //systemOutPrintln(secondFileName);
       // System.out.println(printing(3.1,false));
       // String x = "asghjfdsaf";
       // System.out.println(x.substring(0,4));
     //   System.out.println(x.charAt(5));
        //System.out.println(splitSelbst("I love prorammiung java and c#dfg",' '));

    }






    /*public void run() {
    String fullFilename;
        BufferedReader fileReader = new BufferedReader(new FileReader(fullFilename));
        while (fileReader.ready()) {
        }
        //add your code here - добавьте код тут
    }*/
    }