package com.Thecoder;

import static com.Thecoder.ThreadColor.ANSI_GREEN;
import static com.Thecoder.ThreadColor.ANSI_BLUE;

public class Main {

    public static void main(String[] args) {

            System.out.println(ANSI_GREEN+"Hello. This is the main thread");

            AnotherThread anotherThread = new AnotherThread();
            anotherThread.start();

            new Thread(){
                public void run(){
                    System.out.println("Hello from the anonymous class thread");
                }
            }.start();

            Thread myRunnable = new Thread(new MyRunnable());
            myRunnable.start();
            System.out.println(ANSI_GREEN+"Hello again from the main thread");


        }
    }

