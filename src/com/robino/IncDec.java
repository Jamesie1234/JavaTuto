package com.robino;

public class IncDec {
    public void incrementDecrement(){
        int a = 1;
        int b = 2;
        int c, d;
        c = ++b;
        d = a++;
        c++;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
