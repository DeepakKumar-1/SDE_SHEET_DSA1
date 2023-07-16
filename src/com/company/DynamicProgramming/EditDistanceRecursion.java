package com.company.DynamicProgramming;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class EditDistanceRecursion {
    private static int minDistance(String s, String t){
        // Base case
        if(s.isEmpty()){
            return t.length();
        }
        if(t.isEmpty()){
            return s.length();
        }
        // if first Character of both strings are Equal
        if(s.charAt(0) == t.charAt(0)){
            return minDistance(s.substring(1), t.substring(1));
        }
        // else explore all options
        // option 1 : insert one character
        int opt1 = minDistance(s, t.substring(1));
        // option 2 : Delete one character
        int opt2 = minDistance(s.substring(1), t);
        // option 3 : replace one character
        int opt3 = minDistance(s.substring(1), t.substring(1));
        return 1 + Math.min(opt1, Math.min(opt2, opt3));
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String w1 = sc.next();
        String w2 = sc.next();
        int res = minDistance(w1, w2);
        System.out.println(res);
    }
}
