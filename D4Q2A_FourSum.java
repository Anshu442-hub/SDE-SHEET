package com.jKm;

import java.util.*;
import java.util.Arrays;
import java.util.List;

public class D4Q2A_FourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        long tar=target;
        List<List<Integer>> ans=new ArrayList<>();
        HashMap<ArrayList<Integer>,ArrayList<Integer>> hashMap=new HashMap<>();
        Arrays.sort(nums);
        int n= nums.length;
        for (int i = 0; i < n ; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    long temp=(long)nums[i]+(long)nums[j]+(long)nums[k];
                    long t2=tar-temp;
                    int l=k+1,h=n-1,m;
//                    System.out.println("temp :"+ temp);


                    while (l <= h) {
                        m = l + (h - l) / 2;

                        // Check if x is present at mid
                        if (nums[m] == t2) {
                            ArrayList<Integer> keyAL=new ArrayList<>();
                            ArrayList<Integer> indexAL=new ArrayList<>();
                            Collections.addAll(keyAL,nums[i],nums[j],nums[k],nums[m]);
                            Collections.addAll(indexAL,i,j,k,m);
                            hashMap.put(keyAL,indexAL);
                        }
                        // If x greater, ignore left half
                        if (nums[m] < t2)
                            l = m + 1;

                            // If x is smaller, ignore right half
                        else
                            h = m - 1;
                    }
                    //search temp using binary search;
                }
            }
        }
        for (ArrayList<Integer> key : hashMap.keySet()) {
            ans.add((key));
        }
        return ans;
    }
    public static void main(String[] args) {
        D4Q2A_FourSum sum=new D4Q2A_FourSum();
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
//
//        int[] num5={4 ,3 ,3 ,4 ,4 ,2 ,1 ,2 ,1, 1};
//        int target5=9;
//        System.out.println(sum.fourSum(num5,target5));



    }



    }

