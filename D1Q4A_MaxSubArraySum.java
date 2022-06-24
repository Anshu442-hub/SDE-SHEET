package com.jKm;

public class D1Q4A_MaxSubArraySum {
    private static int maxSubArray(int[] nums) {
        int max_sum = 0;
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        for (int i = 0; i <n; i++) {
            for (int j = i; j <= n - 1; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++){
                    sum = sum + nums[k];
                }
                if (sum > max_sum) {
                    max_sum = sum;
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
         int[] nums5 = {-1,-2,-3,-4,-5};//-1 error
        int[] nums6 = {-1, -2, -3, 0, -5};//0
        int[] nums7 = { 1, 2, 7 ,-4, 3, 2 ,-10 ,9 ,1};//11
        int[] nums8 ={  10 ,20 ,-30 ,40 ,-50, 60};//60

        System.out.println(  maxSubArray(nums1));
        System.out.println("Largest sumsub array : " + maxSubArray(nums2));
        System.out.println("Largest sumsub array : " + maxSubArray(nums3));
        System.out.println("Largest sumsub array : " + maxSubArray(nums4));
        System.out.println("Largest sumsub array : " + maxSubArray(nums5));
        System.out.println("Largest sumsub array : " + maxSubArray(nums6));
        System.out.println("Largest sumsub array : " + maxSubArray(nums7));
        System.out.println("Largest sumsub array : " + maxSubArray(nums8));

    }

}


