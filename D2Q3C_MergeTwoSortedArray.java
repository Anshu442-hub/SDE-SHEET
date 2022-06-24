package com.jKm;
public class D2Q3C_MergeTwoSortedArray {
    public static void Sol(int []nums1,int[]nums2,int m,int n){
        int gap =(int) Math.ceil((double)(m + n) / 2.0);
        while (gap > 0) {
            int i = 0;
            int j = gap;
            while (j < (m + n)) {
                if (j < m && nums1[i] > nums1[j]) {
                    swap(nums1,i,nums1,j);
                } else if (j >= m && i < m && nums1[i] > nums2[j - m]) {
                    swap(nums1,i, nums2,j - m);
                } else if (j >= m && i >= m && nums2[i - m] > nums2[j - m]) {
                    swap(nums2,i - m, nums2,j - m);
                }
                j++;
                i++;
            }
            if (gap == 1) {
                gap = 0;
            } else {
                gap =(int) Math.ceil((double) gap / 2.0);
            }
        }
        }
        static void swap(int []arr1,int i,int arr2[],int j) {
        int temp=arr1[i];
        arr1[i]=arr2[j];
        arr2[j]=temp;
    }

    public static void main(String[] args) {
//        int arr1[] = {1,4,7,8,10,0,0,0};
//        int arr2[] = {2,3,9};
//        int n=arr1.length;
//        int m= arr2.length;
        int arr1[] = {1,3,5,7,0,0,0};
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



