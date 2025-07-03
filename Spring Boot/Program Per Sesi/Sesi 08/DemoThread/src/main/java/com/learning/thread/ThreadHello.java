package com.learning.thread;

import java.util.logging.*;

public class ThreadHello implements Runnable {

    private final String name;

    public ThreadHello(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(name + ": Hello");
        try {
            Thread.sleep(250);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadHello.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}