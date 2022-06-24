package com.jKm;
import java.util.Arrays;
public class D2Q4B_DuplicateNo {
    public static int Sol(int[] nums) {

        int n = nums.length;
        int[] freq = new int[n + 1];

        for (int i = 0; i < n; i++) {
            if (freq[nums[i]] == 0){
                freq[nums[i]] += 1;
            }
        else{
            return nums[i];
        }
    }
        return -1;
}
    public static void main (String []args) {

            int[] arr={1,3,4,5,2};

//              int[] arr={1,3,4,2,3};
//            int[] arr={1,1};
//            int[] arr={1,1,2};

        System.out.println("res : "+ Sol(arr));

    }
}
