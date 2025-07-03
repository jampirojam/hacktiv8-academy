package com.learning.challenge;

import java.util.*;

public class JavaReadXmlSaxEx {
    public static void main(String[] args) {
        Runner runner = new Runner();
        List<User> lines = runner.parseUsers();
        System.out.print("[");
        lines.forEach(System.out::print);
        System.out.print("]");
    }
}