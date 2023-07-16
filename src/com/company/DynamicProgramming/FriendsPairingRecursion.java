package com.company.DynamicProgramming;

import java.util.Scanner;

public class FriendsPairingRecursion {
    private static int friendsPairing(int n){
        // base case
        if(n == 1 || n == 2){
            return n;
        }
        return 1*friendsPairing(n-1)  + (n-1)*friendsPairing(n-2);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = friendsPairing(n);
        System.out.println(res);
    }
}
