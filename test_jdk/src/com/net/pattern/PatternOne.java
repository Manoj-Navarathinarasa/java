package com.net.pattern;

public class PatternOne {
    public static void main(String[] args) {

        int a = 3;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("1");
                for (int k = 0; k < i; k++) {
                    System.out.print("2");
                }
            }
            System.out.println("3");
        }

    }
}
