package com.company.Array;

public class WaysToSwap2Numbers {
    private static void swap1(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a: " + a + " b: " + b);
    }
    private static void swap2(int a, int b){
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a: " + a + " b: " + b);
    }
    private static void swap3(int a, int b){
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("a: " + a + " b: " + b);
    }
    public static void main(String []args){
        int a = 5;
        int b = 10;
        System.out.println("a: " + a + " b: " + b);
//        swap1(a,b);
//        System.out.println("a: " + a + " b: " + b);
//        swap2(a,b);
        swap3(a,b);


    }
}
