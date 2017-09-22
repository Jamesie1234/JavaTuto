package com.robino;

public class Casting {

    /**
     * Type promotion rules:
     * 1) byte and short are always promoted to int
     * 2) if one operand is long, the whole expression is promoted to long
     * 3) if one operand is float, the entire expression is promoted to float
     * 4) if any operand is double, the result is double
     */

    //promote example
    public void promoteExample(){
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println("result = " + result);
    }

    public void Convertion() {
        byte b;
        int i = 257;
        double d = 323.142;
        System.out.println("\nConversion of int to byte.");
        b = (byte) i;
        System.out.println("i and b " + i + " " + b);
        System.out.println("\ndouble to int.");
        i = (int) d;
        System.out.println("d and i " + d + " " + i);
    }
}
