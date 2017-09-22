package com.robino;

public class OperatorClass {
    public void logicalOperator(){
        int n = 2;
        if (n != 0 && n / 2 > 10)
            System.out.println("This is true");
        else
            System.out.println("This is false");
    }

    public void bitwiseOperator(){
        String binary[] = { "0000","0001","0010", "0011", "0110", "0111" , "1000", "1001", "1010"};
        int a = 3; // 0 + 2 + 1 or 0011 in binary
        int b = 6; // 4 + 2 + 0 or 0110 in binary
        int c = a | b;
        int d = a & b;
        int e = a ^ b;
        System.out.print("a =" + binary[a]);
        System.out.println("and b =" + binary[b]);
        System.out.println("a|b = " + binary[c]);
        System.out.println("a&b = " + binary[d]);
        System.out.println("a^b = " + binary[e]);
    }

    public void conditionOperator(){
        int i, k;
        i = 10;
        k = i < 0 ? -i : i;
        System.out.println("Abs value of " + i + " is " + k);
        i = -10;
        k = i < 0 ? -i : i;
        System.out.println("Abs value of " + i + " is " + k);
    }
}
