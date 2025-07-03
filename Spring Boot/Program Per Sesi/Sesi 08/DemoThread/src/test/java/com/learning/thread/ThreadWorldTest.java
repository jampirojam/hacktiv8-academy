package com.learning.thread;

import org.junit.Test;

public class ThreadWorldTest {
    public ThreadWorldTest() {

    }

    @Test
    public void testRun() {
        System.out.println("---------------");
        for (int i = 0; i < 5; i++) {
            ThreadWorld instance = new ThreadWorld();
            ThreadHello instanceDua = new ThreadHello(String.valueOf(i));
            instance.setName(i + "");
            instance.start();
            instanceDua.run();
        }
    }
}