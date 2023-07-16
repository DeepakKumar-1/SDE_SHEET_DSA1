package com.company.DynamicProgramming;

import java.util.Scanner;

public class FriendsPairingProblemIteration {
    private static int friendsPairing(int n){
        int a = 1, b = 2, curr = 0;
        if(n <= 2){
            return n;
        }

        // b = (i-1)
        // a = (i-2)
        for(int i=3; i<=n; i++){
            curr = b  + (i-1)*a;
            a = b;
            b = curr;
        }
        return curr;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = friendsPairing(n);
        System.out.println(res);
    }
}
