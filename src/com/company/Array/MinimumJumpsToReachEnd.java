package com.company.Array;

// PENDING GIVING WRONG RESULT And also LOGIC IS WRONG
import java.util.Arrays;
import java.util.Scanner;

public class MinimumJumpsToReachEnd {
    private static int minJumps(int []a, int s, int e, int jumpCount){
        if(e >= a.length-1){
            return jumpCount;
        }
        // Find Maximum Jumps in range s and e
        int maxJump = 0;
        for(int i=s; i<=e; i++){
            if(a[i] > maxJump){
                maxJump = a[i];
            }
        }
        // Now Call the Method Again
        if(a[s] == 0) {
            return minJumps(a, s, maxJump + e, jumpCount + 1);
        }else{
            return minJumps(a, s+1, maxJump + e, jumpCount + 1);
        }
    }
    private static int minJumps(int []a){
        return minJumps(a, 0, 0, 0);
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        // Take Elements from user
        System.out.print("Enter Elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // Display Array
        System.out.print(Arrays.toString(arr));
        int res = minJumps(arr);
        System.out.println(res);

    }
}
