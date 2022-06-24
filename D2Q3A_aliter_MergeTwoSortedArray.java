package com.jKm;

import java.util.Arrays;

public class D2Q3A_aliter_MergeTwoSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n){
        int rista[]=new int[m+n];
        int i=0,j=0,x=0;
        while(i<m&&j<n){
            if (nums1[i]<nums2[j]) {
                rista[x] = nums1[i];x++;i++;
//                System.out.println(Arrays.toString(rista));
            }else {
                rista[x] = nums2[j];x++;j++;
//                System.out.println(Arrays.toString(rista));
            }
        }
//        System.out.println("---------------------------");
        while (i<m){
            rista[x] = nums1[i];x++;i++;
//            System.out.println(Arrays.toString(rista));
        }
//        System.out.println("---------------------------");
        while (j<n){
            rista[x] = nums2[j];x++;j++;
//            System.out.println(Arrays.toString(rista));
        }
//        System.out.println("---------------------------");
        for (int k = 0; k < m + n; k++) {
            nums1[k]=rista[k];
        }

    }
//    [1,2,2,3,5,6]

    public static void main(String[] args) {
        D2Q3A_aliter_MergeTwoSortedArray o1=new D2Q3A_aliter_MergeTwoSortedArray();
        int[] a1={1,2,3,0,0,0},a2={2,5,6};
        int[] x={0,0,0},y={2,5,6};
        int[] p={1,2,3,0,0,0},q={};

        o1.merge(a1,3,a2,3);
        o1.merge(x,0,y,3);
        o1.merge(p,3,q,0);
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(p));
    }


}
