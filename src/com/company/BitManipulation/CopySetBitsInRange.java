package com.company.BitManipulation;

import java.util.Scanner;

public class CopySetBitsInRange {

    private static int copySetBits(int a, int b, int l, int r) {
        for(int i=l; i<=r; i++){
            int mask = i << 1;
            if((b & mask) != 0) {
                a = a | mask;
            }
        }
        return a;
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("First No: ");
        int a = sc.nextInt();
        System.out.print("Second No: ");
        int b = sc.nextInt();
        System.out.print("Enter Range : ");
        int l = sc.nextInt();
        int r = sc.nextInt();
        int res = copySetBits(a, b, l, r);
        System.out.println(res);
    }


}
