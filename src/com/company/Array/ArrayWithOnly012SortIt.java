package com.company.Array;

import java.util.*;

public class ArrayWithOnly012SortIt {
    private static void sortArray(int []arr){
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
//                System.out.println(map);
            }else{
                map.put(arr[i], 1);
            }
        }
        System.out.println(map);

        int j = 0;
        for(int key: map.keySet()){
            System.out.println(map.keySet());
            for(int i=0; i< map.get(key); i++){
                arr[j++] = key;
            }
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
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
