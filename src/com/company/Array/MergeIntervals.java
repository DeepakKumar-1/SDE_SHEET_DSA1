package com.company.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class MergeIntervals {
    private static int [][] mergeIntervals(int [][]intervals){
        // Sort the Array According to First Value
        if(intervals.length <= 1){
            return intervals;
        }
        Arrays.sort(intervals,(a, b) -> a[0] - b[0]);
        List<int[]> res = new ArrayList<>();
        int s = intervals[0][0];
        int e = intervals[0][1];
        for(int []i: intervals){
            if(e >= i[0]){
                // change end for merging
                e = Math.max(e, i[1]);
            }else{
                // Add the values in res
                res.add(new int[]{s,e});
                // update the intervals
                s = i[0];
                e = i[1];
            }
        }
        res.add(new int[]{s,e});
        return res.toArray(new int[0][]);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array n and m: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][]arr = new int[n][m];

        System.out.print("Enter Elements Row Wise: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // Display Array
        for(int []row: arr) {
            System.out.println(Arrays.toString(row));
        }

        // Now Merge Intervals
        int [][] res = mergeIntervals(arr);
        // Display Result
        for(int[] row: res){
            System.out.println(Arrays.toString(row));
        }
    }
}
