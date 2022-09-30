package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread {
    private Thread thread;

    public LoggingStateThread(Thread thread) {
        this.thread = thread;
        setDaemon(true);
    }

    @Override
    public void run() {
        State currentState = thread.getState();
        System.out.println(currentState);


        while (true) {
            if (thread.getState() != currentState){
                currentState = thread.getState();
                System.out.println(currentState);}
            if (currentState.equals(State.TERMINATED)){
                //interrupt();
               break;
        }
        }
            interrupt();
    }
}

