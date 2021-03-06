package com.jKm;
public class D3Q1B_SearchIn2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m= matrix.length,n=matrix[0].length;
        int i=0,j=n-1;
        while (i<m&&j>=0){
            if (target==matrix[i][j]) return true;
            else if (target<matrix[i][j]) j--;
            else if (target>matrix[i][j]) i++;
        }
        return false;
    }
    public static void main(String[] args) {
        D3Q1B_SearchIn2DMatrix dmatrix=new D3Q1B_SearchIn2DMatrix();
        int [][] matrix={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
//        int [][] matrix={{10,20,30,40},{11,21,36,43},{25,29,39,50},
//                {50,60,70,80}};
        int target = 60;
        System.out.println(dmatrix.searchMatrix(matrix,target));
    }
}

