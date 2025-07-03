package com.learning.thread;

import org.junit.Test;

public class ThreadNumberTest {
    public ThreadNumberTest() {

    }

    @Test
    public void testRun() {
        System.out.println("---------------");
        NumberGenerator generator = new NumberGenerator(1, 10000);
        for (int i = 0; i < 10; i++) {
            new ThreadNumber(generator).start();
        }
    }
}