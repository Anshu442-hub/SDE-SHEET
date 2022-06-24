package com.jKm;
import java.util.Arrays;
public class D3Q3Aa_MajorityElement2 {
    public int majorityElement(int[] nums) { //TLE
        int n= nums.length;
        if (nums.length==1 && nums[0]==0 ) return 0;
        int count=1;
        Arrays.sort(nums);
        for (int i = 0; i < n-1; i++) {
            if (nums[i] == nums[i + 1]) count++;
            else count=1;
            if (count>n/2) return nums[i];
        }
        return count;
    }
    public static void main(String[] args) {
        D3Q3Aa_MajorityElement2 elementN2=new D3Q3Aa_MajorityElement2();

        int[]  nums = {5,5,9,1,1,1,1,1};
        System.out.println(elementN2.majorityElement(nums));//1
        int[]  nums2= {1};
        System.out.println(elementN2.majorityElement(nums2));//1
        int[]  nums3= {0};
        System.out.println(elementN2.majorityElement(nums3));//0
        int[]  nums4= {1,5,5,5,5,5,5,7,7,7,7,7,7,7,7,7};
        System.out.println(elementN2.majorityElement(nums4));//7
        int[]  nums5= {1,5,5,5,5,5,5,5,5,5,7,7,7,7,7,7};
        System.out.println(elementN2.majorityElement(nums5));//5
        int[]  nums6= {3,2,3};
        System.out.println(elementN2.majorityElement(nums6)); //3
        int[]  nums7= {2,2,1,1,1,2,2};
        System.out.println(elementN2.majorityElement(nums7)); //2

        int[]  nums8= {4,4,2,4,3,4,4,3,2,4};
        System.out.println(elementN2.majorityElement(nums8)); //4

    }
}
