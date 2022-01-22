package com.Thecoder;
import static com.Thecoder.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println(ANSI_RED+"RUNNABLE is running here");

    }
}