package com.jKm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
public class D4Q2B_FourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> quad=new ArrayList<>();
        if (nums == null || nums.length == 0)
            return quad;
        Arrays.sort(nums);
        int n= nums.length;
        long tar=target;
        for (int i = 0; i < n ; i++) {
            for (int j = i+1; j < n; j++) {

                long t2=tar-(long)(nums[i]+nums[j]);
                int front=j+1,back=n-1;
                while (front<back){
                    int s2=nums[front]+nums[back];
                    if (s2==t2){
                        ArrayList<Integer> an=new ArrayList<>();
                        Collections.addAll(an,nums[i],nums[j],nums[front],nums[back]);
//                        an.add(nums[i]);//0
//                        an.add(nums[j]);//1
//                        an.add(nums[front]);//2
//                        an.add(nums[back]);//3
                        quad.add(an);
                        while (front<back&&an.get(2)==nums[front])front++;// skip front
                        while (front<back&&an.get(3)==nums[back])back--;// skip back
                    }else if (s2<t2){
                        front++;
                    }else {
                        back--;
                    }
//                    System.out.println("bum");
                }
                while (j+1<n&&nums[j+1]==nums[j])j++;//skip j
            }
            while (i+1<n&&nums[i+1]==nums[i])i++;    //skip i
        }
        return quad;
    }
    public static void main(String[] args) {
        D4Q2B_FourSum sum=new D4Q2B_FourSum();

        int[] num1={4 ,3 ,3 ,4 ,4 ,2 ,1 ,2 ,1, 1};
        //[[1, 2, 2, 4], [1, 1, 3, 4], [1, 2, 3, 3]]
        int target1=9;
        System.out.println(sum.fourSum(num1,target1));

        int[] num2={1,0,-1,0,-2,2};
        //[[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
        int target2=0;
        System.out.println(sum.fourSum(num2,target2));

        int[] num3={2,2,2,2,2};// [[2,2,2,2]]
        int target3=8;
        System.out.println(sum.fourSum(num3,target3));

        int[] num4={1000000000,1000000000,1000000000,1000000000};
        //[]
        int target4= -294967296;
        System.out.println(sum.fourSum(num4,target4));
    }
}
