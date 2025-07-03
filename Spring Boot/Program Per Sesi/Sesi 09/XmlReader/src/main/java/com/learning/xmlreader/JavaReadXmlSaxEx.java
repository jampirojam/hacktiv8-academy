package com.learning.xmlreader;

import java.util.*;

public class JavaReadXmlSaxEx {
    public static void main(String[] args) {
        MyRunner runner = new MyRunner();
        List<User> lines = runner.parseUsers();

        lines.forEach(System.out::println);
    }
}