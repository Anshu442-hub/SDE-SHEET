package com.jKm;

public class D3Q6a_Count_Reverse_Pair{
    public int reversePairs(int[] nums) {//TLE
        int count=0;
        int n= nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                long a=nums[i],b=nums[j];
                if (a>2*b)
                    count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        D3Q6a_Count_Reverse_Pair pairs=new D3Q6a_Count_Reverse_Pair();
        int[] nums1={1,3,2,3,1};  //2
        int[] nums2={2,4,3,5,1}; //3
        int[] nums3={2147483647,2147483647,2147483647
                ,2147483647,2147483647,2147483647};    //0
        int[] nums4={3,2,1,4};//1
        int nums5 [] = { 12, 11, 13, 5, 6, 7 };//4
        int nums6[] = { 40,25,19,12,9,6,2 };//15
        int nums7[] = {1, 3, 2, 3, 1};//2
        int nums8[] = {2,4,3,5,1};//3/

        System.out.println(pairs.reversePairs(nums1));
        System.out.println(pairs.reversePairs(nums2));
        System.out.println(pairs.reversePairs(nums3));
        System.out.println(pairs.reversePairs(nums4));
        System.out.println(pairs.reversePairs(nums5));
        System.out.println(pairs.reversePairs(nums6));
        System.out.println(pairs.reversePairs(nums7));
        System.out.println(pairs.reversePairs(nums8));
    }





}
