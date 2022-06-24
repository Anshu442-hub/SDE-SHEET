package com.jKm;

public class D3Q5b_Unique_Path {
    int uniquePaths(int m, int n) { //TLE
        return countPaths(0,0,m,n);
    }
    private int countPaths(int i, int j, int m, int n) {
        if (i>=m||j>=n) return 0;
        if (i==m-1&&j==n-1) return 1;
        return countPaths(i+1,j,m,n)+countPaths(i,j+1,m,n);
    }
    public static void main(String[] args) {
        D3Q5b_Unique_Path uniquePaths=new D3Q5b_Unique_Path();
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
