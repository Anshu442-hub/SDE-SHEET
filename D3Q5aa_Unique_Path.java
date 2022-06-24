package com.jKm;

public class D3Q5aa_Unique_Path {

    public static void main(String[] args) {
        D3Q5aa_Unique_Path uniquePaths=new D3Q5aa_Unique_Path();
        int path1=uniquePaths.uniquePaths(3,7);//28
        System.out.println(path1);
        int path2=uniquePaths.uniquePaths(3,2);//3
        System.out.println(path2);
        int path3=uniquePaths.uniquePaths(2,2);//2
        System.out.println(path3);
        int path4=uniquePaths.uniquePaths(2,3);//3
        System.out.println(path4);
    }
    private int uniquePaths(int m, int n) { //success
        int [][] arr =new int[m+1][n+1];
        arr[0][1]=1;
          for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                arr[i][j]=arr[i-1][j]+arr[i][j-1];
            }
        }
        return arr[m][n];
    }
}
