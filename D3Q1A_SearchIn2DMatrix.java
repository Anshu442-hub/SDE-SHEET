package com.jKm;
public class D3Q1A_SearchIn2DMatrix {
    public boolean searchMatrix(int[][]matrix, int target){
        int m=matrix.length;
        int n=matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j]==target) return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [][]matrix={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=3;
        D3Q1A_SearchIn2DMatrix matrix1=new D3Q1A_SearchIn2DMatrix();
        System.out.println(matrix1.searchMatrix(matrix,target));
    }
}
