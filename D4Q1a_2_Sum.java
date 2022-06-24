package com.jKm;

import java.util.Arrays;

public class D4Q1a_2_Sum {

    public int[] twoSum(int[] nums, int target) {

        int []ans=new int[2];
        int n=nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <n ; j++) {
                if(nums[i]+nums[j]==target) {
                    ans[0]=i;ans[1]=j;
                }

            }
        }
        return ans;

    }

    public static void main(String[] args) {
        D4Q1a_2_Sum indices=new D4Q1a_2_Sum();
        int arr1[]={3,2,4,6}; //[1 ,2]
        int target1=6;
        System.out.println(Arrays.toString(indices.twoSum(arr1,target1)) );

        int arr2[]={2,7,11,1}; //[0 ,1]
        int target2=9;
        System.out.println(Arrays.toString(indices.twoSum(arr2,target2)) );

        int arr3[]={3,2,4}; //[1 ,2]
        int target3=6;
        System.out.println(Arrays.toString(indices.twoSum(arr3,target3)) );

        int arr4[]={3,3}; //[1 ,0]
        int target4=6;
        System.out.println(Arrays.toString(indices.twoSum(arr4,target4)) );


    }


}

