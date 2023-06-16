package com.company.Array;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArraysWithoutExtraSpace {
    private static void merge(int []a, int []b){
        int i=0;
        int j=0;
        while(i<a.length && j<b.length){
            if(a[i] <= b[j]){
                i++;
            }else{
                // swap and Sort b
                int temp = a[i];
                a[i] = b[j];
                b[j] = temp;
                Arrays.sort(b);
            }
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of First Array: ");
        int n = sc.nextInt();
        int []arr1 = new int[n];
        // Now Take Elements of Array
        System.out.print("Enter Elements: ");
        for(int i=0; i<arr1.length; i++){
            arr1[i] = sc.nextInt();
        }

        // Take Second Array
        System.out.print("Enter Size of Second Array: ");
        int m = sc.nextInt();
        int []arr2 = new int[m];
        // Now Take Elements of Array
        System.out.print("Enter Elements: ");
        for(int i=0; i<m; i++){
            arr2[i] = sc.nextInt();
        }
        System.out.println("a: " + Arrays.toString(arr1) + " b: " + Arrays.toString(arr2));

        // Call Procedure to Merge these Arrays with no extra space
        merge(arr1, arr2);
        System.out.println("a: " + Arrays.toString(arr1) + " b: " + Arrays.toString(arr2));

    }
}

/*
Enter Size of First Array: 6
Enter Elements: 1 5 9 10 15 20
Enter Size of Second Array: 4
Enter Elements: 2 3 8 13
a: [1, 5, 9, 10, 15, 20] b: [2, 3, 8, 13]
a: [1, 2, 3, 5, 8, 9] b: [10, 13, 15, 20]
 */