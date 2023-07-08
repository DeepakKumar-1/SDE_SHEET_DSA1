package com.company.Matrix;

import java.util.Scanner;

public class MatrixMultiplication {
    private static int[][] multiply(int[][] m1, int[][] m2) {
        int n = m1.length;
        int m = m2[0].length;
        int [][]c = new int[n][m];
        for(int i=0; i<c.length; i++){
            for(int j=0; j<c[i].length; j++){
                int sop = 0; // sop - > sum of Product
                for(int k=0; k<m2.length; k++){
                    sop += (m1[i][k] * m2[k][j]);
                }
                // now store the sop
                c[i][j] = sop;
            }

        }
        return c;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        // take size of First Matrix
        System.out.print("Enter Size of First Matrix: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int [][]m1 = new int[r1][c1];
        // take Elements of First Matrix
        System.out.print("Enter Elements of First Matrix Row Wise: ");
        for(int i=0;i<m1.length; i++){
            for(int j=0; j<m1[0].length; j++){
                m1[i][j] = sc.nextInt();
            }
        }
        // take size of Second Matrix
        System.out.print("Enter Size of Second Matrix: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int [][]m2 = new int[r2][c2];
        // take Elements of First Matrix
        System.out.print("Enter Elements of Second Matrix Row Wise: ");
        for(int i=0;i<m2.length; i++){
            for(int j=0; j<m2[0].length; j++){
                m2[i][j] = sc.nextInt();
            }
        }

        if(c1 != r2){
            System.out.println("Matrix Multiplication Condition is Not Satisfied");
        }else{
            int [][]c = multiply(m1, m2);
            //print the result
            for(int i=0; i<c.length; i++){
                for(int j=0; j<c[0].length; j++){
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

}

