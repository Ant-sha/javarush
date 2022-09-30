package com.javarush.task.task25.task2508;

public class TaskManipulator implements Runnable,CustomThreadManipulator {
    private Thread thread = new Thread();
    @Override
    public void run() {
        while(!thread.isInterrupted()){
            try {
                System.out.println(thread.getName());
                Thread.sleep(100);
            } catch(InterruptedException e){
                thread.interrupt();
            }
        }
    }

    @Override
    public void start(String threadName) {
 this.thread=new Thread(this);
this.thread.setName(threadName);
 this.thread.start();
    }

    @Override
    public void stop() {
        thread.interrupt();

    }
}
