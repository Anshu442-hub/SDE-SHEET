package com.jKm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class D4Q5B_Count_Subarrays_Given_XOR {
    public static int subarraysXor(ArrayList<Integer> arr,int x){ //success in code studio interview bit
        HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        int c = 0;
        int res = 0;
        int n =arr.size();
        for(int i = 0;i<n;i++) {
            res = res ^ arr.get(i);
            if(res == x) c++;
            if(hmap.get(res^x) != null) c += hmap.get(res ^ x);
            if(hmap.get(res) != null) hmap.put(res, hmap.get(res) + 1);
            else hmap.put(res, 1);
        }
        return c;
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
