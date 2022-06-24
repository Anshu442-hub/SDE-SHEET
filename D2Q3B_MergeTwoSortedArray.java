package com.jKm;
import java.util.Arrays;
public class D2Q3B_MergeTwoSortedArray {
    public static void Sol(int []nums1,int []nums2,int m ,int n){
        for (int i = 0; i < m; i++) {
            if(nums1[i]>nums2[0]){
                int temp=nums1[i];
                nums1[i]=nums2[0];
                nums2[0]=temp;
            }
            int first=nums2[0];
            int j;
            for (j = 1; j <n &&nums2[j]<first; j++) {
                nums2[j-1]=nums2[j];
            }
            nums2[j-1]=first;
        }
    }
    public static void main(String[] args) {
//        int arr1[] = {1,4,7,8,10};
//        int arr2[] = {2,3,9};
//        int n=arr1.length;
//        int m= arr2.length;
        int arr1[] = {1,3,5,7};
        int arr2[] = {0,2,6,8,9};
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
