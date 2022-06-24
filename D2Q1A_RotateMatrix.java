package com.jKm;
import java.util.Arrays;
public class D2Q1A_RotateMatrix {
    public  void Sol(int [][]matrix){
        int n= matrix.length;
        int [][]dummy=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dummy[j][n-i-1]=matrix[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j]=dummy[i][j];
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        D2Q1A_RotateMatrix ans=new D2Q1A_RotateMatrix();
        ans.Sol(matrix);
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }




}
