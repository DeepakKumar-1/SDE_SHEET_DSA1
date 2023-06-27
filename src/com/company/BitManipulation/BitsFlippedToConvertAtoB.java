package com.company.BitManipulation;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class BitsFlippedToConvertAtoB {

    private static int flippedBits(int a, int b) {
        int n = a^b;
        // count set bits in n
        int count = 0;
        while(n > 0){
            if((n &1) == 1){
                count++;
            }
            n >>= 1;
        }
        return count;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("First No: ");
        int a = sc.nextInt();
        System.out.print("Second No: ");
        int b = sc.nextInt();
        int res = flippedBits(a, b);
        System.out.println(res);
    }

}
