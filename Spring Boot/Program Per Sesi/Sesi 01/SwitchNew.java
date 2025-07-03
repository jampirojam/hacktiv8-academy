// package com.jampirojam.blogspot; // Package

import java.util.Scanner; // Import Library

class SwitchNew { //Class Name
    public static void main(String args[]) { // Main Method

        // I/O and other code type
        String day, result;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Input Char: ");
            day = input.nextLine();
        }
        switch (day) {
            case "M", "W", "F" -> result = "MWF";
            case "T", "TH", "S" -> result = "TTS";
            default -> {
                if (day.isEmpty())
                result = "Please insert a valid day.";
                else
                result = "Looks like a Sunday.";
            }
        };
        System.out.format("New switch results: %s", result);
    }
}