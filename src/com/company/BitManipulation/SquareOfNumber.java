package com.company.BitManipulation;

import java.util.Scanner;

public class SquareOfNumber {

    private static int square(int n) {
        if(n == 0 || n ==1){
            return n;
        }

        // check if number is Even or Odd
        int  x = n/2;
        if((n & 1) == 1){ // ODD
           return (2<<1)*square(x) + ((2<<1)*x)  + 1;
        }
        // for Even Number
        return (2<<1)*square(x);

    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = square(n);
        System.out.println(res);
    }

}
