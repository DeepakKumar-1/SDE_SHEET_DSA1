package com.company.DynamicProgramming;

import java.util.Scanner;

public class SubSetSumProblem {

    private static boolean subSetSum(int []set, int sum, int i){
        // base case
        if(sum == 0){
            return true;
        }
        if(i >= set.length || sum < 0){
            return  false;
        }
        // for every element either take it or not take it
        // take it
        boolean opt1 = subSetSum(set, sum-set[i], i+1);
        // don't take it
        boolean opt2 = subSetSum(set, sum, i+1);
        return opt1 || opt2;
    }
    private static boolean subSetSum(int[] set, int sum) {
        return subSetSum(set, sum , 0);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []set = new int[n];
        for(int i=0; i<set.length; i++){
            set[i] = sc.nextInt();
        }
        int sum = sc.nextInt();
        boolean res = subSetSum(set, sum);
        System.out.println(res);
    }

}
