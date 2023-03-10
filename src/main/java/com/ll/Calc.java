package com.ll;

public class Calc {
    public static int add(String exp) {
        String[] bits = exp.split(" \\+ ");

        int a = Integer.parseInt(bits[0]);
        int b = Integer.parseInt(bits[1]);

        return a + b;
    }

    public static int sub(String exp) {
        String[] bits = exp.split(" \\- ");

        int a = Integer.parseInt(bits[0]);
        int b = Integer.parseInt(bits[1]);

        return a - b;
    }
}