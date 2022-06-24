package com.jKm;

public class D3Q3D_MajorityElement2 {
    public int majorityElement2(int []nums){  //Moore Voting Algo
        int n=nums.length;
        int count =0;
        int me=0;
        for(int i=0;i<n;i++){

            if(count==0)me=nums[i];
            if(me==nums[i]) count++;
            else count--;
        }
        return me;
    }
    public static void main(String[] args) {
        D3Q3D_MajorityElement2 elementN2=new D3Q3D_MajorityElement2();
//        int[]  nums9 =  {2,2,1,1,1,2,2};//2
//        int[]  nums10= {4,4,2,4,3,4,4,3,2,4};//4
//        int[]  nums11 = {7,7,5,7,5,5,7,5,5,7,7,5,5,5,5};//5
//        System.out.println(elementN2.majorityElement2(nums9));
//        System.out.println(elementN2.majorityElement2(nums10));
//        System.out.println(elementN2.majorityElement2(nums11));

        int[]  nums = {5,5,9,1,1,1,1,1};
        System.out.println(elementN2.majorityElement2(nums));//1
        int[]  nums2= {1};
        System.out.println(elementN2.majorityElement2(nums2));//1
        int[]  nums3= {0};
        System.out.println(elementN2.majorityElement2(nums3));//0
        int[]  nums4= {1,5,5,5,5,5,5,7,7,7,7,7,7,7,7,7};
        System.out.println(elementN2.majorityElement2(nums4));//7
        int[]  nums5= {1,5,5,5,5,5,5,5,5,5,7,7,7,7,7,7};
        System.out.println(elementN2.majorityElement2(nums5));//5
        int[]  nums6= {3,2,3};
        System.out.println(elementN2.majorityElement2(nums6)); //3
        int[]  nums7= {2,2,1,1,1,2,2};
        System.out.println(elementN2.majorityElement2(nums7)); //2

        int[]  nums8= {4,4,2,4,3,4,4,3,2,4};
        System.out.println(elementN2.majorityElement2(nums8)); //4

    }
}

