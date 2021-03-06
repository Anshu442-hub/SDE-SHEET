package com.jKm;

import java.util.Arrays;

public class D2Q4C_DuplicateNo {
    public static int Sol(int[] nums) {
            int slow = nums[0];
            int fast = nums[0];
            do {
                slow = nums[slow];
                fast = nums[nums[fast]];
            } while (slow != fast);

            fast = nums[0];
            while (slow != fast) {
                slow = nums[slow];
                fast = nums[fast];
            }
            return slow;
        }
        public static void main (String []args){

//        int[] arr={1,3,4,2,3};
//                    int[] arr={1,1};
            int[] arr={3,1,3,4,2};
        System.out.println("res : "+ Sol(arr));
    }
}
