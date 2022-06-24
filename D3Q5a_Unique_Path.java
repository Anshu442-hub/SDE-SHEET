package com.jKm;

public class D3Q5a_Unique_Path {

    public int uniquePaths(int m, int n) { //success
        int[][] grid = new int[m][n];
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(i==0||j==0)
                    grid[i][j] = 1;
                else
                    grid[i][j] = grid[i][j-1] + grid[i-1][j];
//                System.out.print(grid[i][j] +" ");
            }
//            System.out.println();
        }


        return grid[m-1][n-1];
    }
    public static void main(String[] args) {
        D3Q5a_Unique_Path uniquePaths=new D3Q5a_Unique_Path();
        int path=uniquePaths.uniquePaths(3,7);
//        int path=uniquePaths.uniquePaths(53,4);
//        int path=uniquePaths.uniquePaths(56,5);
        System.out.println(path);
    }
}
