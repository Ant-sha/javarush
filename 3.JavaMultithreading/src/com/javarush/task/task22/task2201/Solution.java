package com.javarush.task.task22.task2201;

/* 
Строки нитей или строковые нити? Вот в чем вопрос
*/

public class Solution {
    public static void main(String[] args) {
        new Solution();
    }

    public static final String FIRST_THREAD_NAME = "1#";
    public static final String SECOND_THREAD_NAME = "2#";

    private Thread thread1;
    private Thread thread2;
    private Thread thread3;

    public Solution() {
        initThreads();
    }

    protected void initThreads() {
        this.thread1 = new Thread(new Task(this, "A\tB\tC\tD\tE\tF\tG\tH\tI"), FIRST_THREAD_NAME);
        this.thread2 = new Thread(new Task(this, "J\tK\tL\tM\tN\tO\tP\tQ\tR\tS\tT\tU\tV\tW\tX\tY\tZ"), SECOND_THREAD_NAME);
        this.thread3 = new Thread(new Task(this, "\t\t"), "3#");

        Thread.setDefaultUncaughtExceptionHandler(new OurUncaughtExceptionHandler());


        this.thread1.start();
        this.thread2.start();
        this.thread3.start();
    }

    public synchronized String getPartOfString(String string, String threadName) throws RuntimeException {
//if(string == null||string.isEmpty())
  //  throw new RuntimeException();
        if(string == null) {
            throw new StringIndexOutOfBoundsException();}

        String resultstring = null;
        String result=null;
//if(threadName.equals(FIRST_THREAD_NAME))
//    throw new StringForFirstThreadTooShortException();
//if(threadName.equals(SECOND_THREAD_NAME))
//    throw new StringForSecondThreadTooShortException();
        try {
            String[] str = string.split("\t");
      //result=string.substring(string.indexOf("\t")+1,string.lastIndexOf("\t"));
            for (int i = 2; i < str.length - 2; i++) {
              resultstring += str[i];
            }
        } catch (StringIndexOutOfBoundsException e) {
            if (threadName.equals(FIRST_THREAD_NAME)) {
                StringForFirstThreadTooShortException ex =
                        new StringForFirstThreadTooShortException();
                ex.initCause(e);
                throw ex;
            } if (threadName.equals(SECOND_THREAD_NAME)) {
                StringForSecondThreadTooShortException ex2 =
                        new StringForSecondThreadTooShortException();
                ex2.initCause(e);
                throw ex2;
            } else {
                throw new RuntimeException(e);
            }


            //if (threadName.equals(Solution.FIRST_THREAD_NAME)) throw new StringForFirstThreadTooShortException();
            //if (threadName.equals(Solution.SECOND_THREAD_NAME)) throw new StringForSecondThreadTooShortException();
            //throw new RuntimeException(e);
        }
        return result;


    }
}
