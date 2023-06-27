package com.company.BitManipulation;

import java.util.Scanner;

public class NumberIsPowerOf2OrNot {

    private static boolean powerOf2(int n) {
        // count set bits in n
        int count = 0;
        while(n > 0){
            if((n &1) == 1){
                count++;
            }
            n >>= 1;
        }
       return count == 1;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean res = powerOf2(n);
        System.out.println(res);
    }

}
