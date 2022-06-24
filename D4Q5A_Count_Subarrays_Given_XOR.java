package com.jKm;

import java.util.ArrayList;
import java.util.Arrays;

public class D4Q5A_Count_Subarrays_Given_XOR {

    public static int subarraysXor(ArrayList<Integer> arr, int x) { //TLE in code studio and interview bit
        int count=0;
        int n= arr.size();
        int res;
        for (int i = 0; i < n; i++) {
            res=0;
            for (int j = i; j < n; j++) {
                res=res^arr.get(j);
                if (res==x){
                    count++;
//                    System.out.print(" :: "+arr.get(i)+" , "+ arr.get(j));
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr1=new ArrayList<Integer>(Arrays.asList(4, 2, 2, 6, 4));//4
        ArrayList<Integer> arr2=new ArrayList<Integer>(Arrays.asList(5, 6, 7, 8, 9));//2
        ArrayList<Integer> arr3=new ArrayList<Integer>(Arrays.asList(5 ,3 ,8 ,3, 10));//2
        ArrayList<Integer> arr4=new ArrayList<Integer>(Arrays.asList(5 ,2 ,9));//1
        ArrayList<Integer> arr5=new ArrayList<Integer>(Arrays.asList(10 ,1 ,0 ,3 ,4, 7));//3
        ArrayList<Integer> arr6=new ArrayList<Integer>(Arrays.asList(4 ,3 ,1 ,2, 4));//4

        System.out.println(subarraysXor(arr1, 6));
        System.out.println(subarraysXor(arr2, 5));
        System.out.println(subarraysXor(arr3, 8));
        System.out.println(subarraysXor(arr4, 7));
        System.out.println(subarraysXor(arr5, 11));
        System.out.println(subarraysXor(arr6, 4));

    }
}

