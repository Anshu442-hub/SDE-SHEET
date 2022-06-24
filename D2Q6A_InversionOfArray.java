package com.jKm;

public class D2Q6A_InversionOfArray {
    public static long getInversions2(long[] arr, int n) { //TLE
        int count=0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <=  n-1; j++) {
                if (arr[i]-arr[j]>0) count++;

            }
        }
        return count;
    }



    public static void main(String[] args) {
        long []arr={1,2,3,4,5};
        int n= arr.length;
        System.out.println(getInversions2(arr,n));
        long []arr2={5,4,3,2,1};
        int n2= arr2.length;
        System.out.println(getInversions2(arr2,n2));
        long []arr3={5,3,2,1,4};
        int n3= arr3.length;
        System.out.println(getInversions2(arr3,n3));
    }
}
