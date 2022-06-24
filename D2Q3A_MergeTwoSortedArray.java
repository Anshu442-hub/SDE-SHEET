package com.jKm;

import java.util.Arrays;

public class D2Q3A_MergeTwoSortedArray {
    public static void Sol(int []nums1,int []nums2,int m,int n) {
        int[] arr3 = new int[n + m];
        int k = 0;
        for (int i = 0; i < m; i++) {
            arr3[k++] = nums1[i];
        }
        for (int i = 0; i < n; i++) {
            arr3[k++] = nums2[i];
        }
//        System.out.println("*****put elements of nums1 and nums2 in arr3*********");
//        for (int i = 0; i < m+n; i++) {
//            System.out.print(arr3[i]+" ");
//        }
//        System.out.println();
//        System.out.println("**************"); // put elements of nums1 and nums2 in arr3
        Arrays.sort(arr3);
//        System.out.println("******sorted arr3********");
//        for (int i = 0; i < m+n; i++) {
//            System.out.print(arr3[i]+" ");
//        }
//        System.out.println();
//        System.out.println("**************");//sorted arr3
        k=0;
        for (int i = 0; i < m; i++) {
            nums1[i]=arr3[k++];
        }
        for (int i = 0; i < n; i++) {
            nums2[i]=arr3[k++];
        }
    }
    public static void main(String[] args) {
        int arr1[] = {1,4,7,8,10};
        int arr2[] = {2,3,9};
        int n=arr1.length;
        int m= arr2.length;
        System.out.println("Before Merge");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < m; i++) {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();



        System.out.println("After Merge");
        Sol(arr1,arr2,n,m);
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < m; i++) {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();

    }


}
