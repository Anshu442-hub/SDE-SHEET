package com.jKm;
import java.util.Arrays;
public class D2Q4A_DuplicateNo {
    public static int Sol(int[] nums) {
            Arrays.sort(nums);
            for(int i=1;i<nums.length;i++){
                if(nums[i]==nums[i-1]) {
                    return nums[i];
                }
            }
            return -1;
        }
        public static void main (String []args) {

//            int[] arr={1,3,4,5,2};
            int[] arr={3,1,3,4,2};
//            int[] arr={1,1};
//            int[] arr={1,1,2};

            System.out.println("res : "+ Sol(arr));

        }


}
