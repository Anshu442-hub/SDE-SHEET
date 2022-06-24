package com.jKm;

public class D3Q5bb_Unique_Path { //Better SolutionV
    private int uniquePaths(int m, int n) {
        int[][] dp = new int[m +1][n+1];
        return countPaths(0,0,m,n,dp);
    }
    private int countPaths(int i, int j, int m, int n,int[][] dp) {
        if (i>=m||j>=n) return 0;
        if (i==m-1&&j==n-1) return 1;
        if (dp[i][j] != 0) return dp[i][j];
        return dp[i][j]=countPaths(i+1,j,m,n,dp)+countPaths(i,j+1,m,n,dp);
    }
    public static void main(String[] args) {
        D3Q5bb_Unique_Path uniquePaths=new D3Q5bb_Unique_Path();
        int path1=uniquePaths.uniquePaths(3,7);
        System.out.println(path1);
        int path2=uniquePaths.uniquePaths(23,12);//TLE
        System.out.println(path2);
        int path3=uniquePaths.uniquePaths(2,3);
        System.out.println(path3);
        int path4=uniquePaths.uniquePaths(3,2);
        System.out.println(path4);
    }
}
