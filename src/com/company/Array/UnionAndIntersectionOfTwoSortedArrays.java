package com.company.Array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UnionAndIntersectionOfTwoSortedArrays {
    private static int[] intersection(int []a, int []b){
        int i=0;
        int j=0;
        ArrayList<Integer> list = new ArrayList<>();
        while(i<a.length && j<b.length){
            if(a[i] == b[j]){
                list.add(a[i]);
                i++;
                j++;
            }else if(a[i] < b[j]){
                i++;
            }else{
                j++;
            }
        }
        int []res = new int[list.size()];
        int k = 0;
        for(int val: list){
            res[k++] = val;
        }
        return res;
    }
    private static int[] union(int []a, int []b){
        int i=0;
        int j=0;
        int []c = new int[a.length + b.length];
        int k = 0;
        while(i<a.length && j<b.length){
            if(a[i]< b[j]){
                c[k] = a[i];
                i++;
                k++;
            }else{
                c[k] = b[j];
                j++;
                k++;
            }
        }
        while(i<a.length){
            c[k] = a[i];
            i++;
            k++;
        }
        while(j<b.length){
            c[k] = b[j];
            j++;
            k++;
        }
        return c;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of first Array: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.print("Enter Elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Size of Second Array: ");
        int m = sc.nextInt();
        int []brr = new int[m];
        System.out.print("Enter Elements: ");
        for(int i=0; i<m; i++){
            brr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr) + "  " + Arrays.toString(brr));
        int []c = union(arr, brr);
        int []d = intersection(arr, brr);
        System.out.println("Union: " + Arrays.toString(c));
        System.out.println("Intersection: " + Arrays.toString(d));
    }
}
