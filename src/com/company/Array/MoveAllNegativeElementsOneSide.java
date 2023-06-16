package com.company.Array;

import java.util.Arrays;
import java.util.Scanner;

public class MoveAllNegativeElementsOneSide {
    private static void moveNegatives(int []arr){
        int i=0;
        int j=0;

        while(!(j > arr.length-1)){
            if(arr[j] < 0){
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            j++;
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.print("Enter Elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        moveNegatives(arr);
        System.out.println(Arrays.toString(arr));
    }
}
