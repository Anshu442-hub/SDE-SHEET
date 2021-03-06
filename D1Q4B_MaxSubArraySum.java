package com.jKm;

import jdk.swing.interop.SwingInterOpUtils;

public class D1Q4B_MaxSubArraySum {


    private static int maxSubArray(int[] nums) {  //TIME LIMIT EXCEEDS
        int max_sum = Integer.MIN_VALUE;
//        System.out.println(max_sum);
        for (int i = 0; i < nums.length; i++) {
            int curr_sum = 0;
            for (int j = i; j < nums.length; j++) {
                curr_sum += nums[j];
                if (curr_sum > max_sum) {
                    max_sum = curr_sum;
                }
            }
        }
        return max_sum;
    }


    public static void main(String[] args) {
        int[] nums1 = {-2,1,-3,4,-1,2,1,-5,4}; //6
        int[] nums2 = {1};//1
        int[] nums3 = {5,4,-1,7,8};//23
        int[] nums4 = {1,2,3,4,5};//15
        int[] nums5 = {-1,-2,-3,-4,-5};//-1
        int[] nums6 = {-1, -2, -3, 0, -5};//0
        int[] nums7 = { 1, 2, 7 ,-4, 3, 2 ,-10 ,9 ,1};//11
        int[] nums8 ={  10 ,20 ,-30 ,40 ,-50, 60};//60

        System.out.println( maxSubArray(nums1));
        System.out.println("Largest sumsub array : " + maxSubArray(nums2));
        System.out.println("Largest sumsub array : " + maxSubArray(nums3));
        System.out.println("Largest sumsub array : " + maxSubArray(nums4));
        System.out.println("Largest sumsub array : " + maxSubArray(nums5));
        System.out.println("Largest sumsub array : " + maxSubArray(nums6));
        System.out.println("Largest sumsub array : " + maxSubArray(nums7));
        System.out.println("Largest sumsub array : " + maxSubArray(nums8));

    }


}
