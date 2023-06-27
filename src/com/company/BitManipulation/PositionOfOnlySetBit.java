package com.company.BitManipulation;

import java.util.Scanner;

public class PositionOfOnlySetBit {
    private static boolean isPowerOf2(int n) {
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

    private static int positionOfSetBit(int n) {
        if(!isPowerOf2(n)){
            return -1;
        }
        int pos = 0;
        while(n > 0){
            pos++;
            n = n>>1;
        }
        return pos;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = positionOfSetBit(n);
        System.out.println(res);
    }

}
