package com.jKm;
import java.util.ArrayList;
import java.util.List;
public class D3Q4C_MajorityElement3 {
    public List<Integer> majorityElement(int[] nums) { //moore voting extended
        List<Integer> ans=new ArrayList<>();
        int n=nums.length;
        int c1=0,c2=0,num1=Integer.MAX_VALUE,num2=Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (num1==nums[i]) c1++;
            else if (num2==nums[i]) c2++;
            else  if (c1==0)  {num1=nums[i];c1=1;}
            else if (c2==0)    {num2=nums[i];c2=1;}
            else  {c1--;c2--;}
        }
        c1=0;c2=0;
        for (int i = 0; i < nums.length; i++) {
            if (num1==nums[i])c1++;
            if (num2==nums[i])c2++;
        }
        if (c1>n/3) ans.add(num1);
        if (c2>n/3) ans.add(num2);
        return ans;
    }

    public static void main(String[] args) {
        D3Q4C_MajorityElement3 elementN3=new D3Q4C_MajorityElement3();
        int[] array = {1,1,1,2,2,2,3,3,3};//[]
        System.out.println(elementN3.majorityElement(array));
        int[] array2 = {1,1,2,2,2,2,3,3,3};//[2]
        System.out.println(elementN3.majorityElement(array2));
        int[] array3 = {1,2,2,2,2,3,3,3,3};//[2,3]
        System.out.println(elementN3.majorityElement(array3));
        int[] array4 = {2,2,2,2,3,3,3,3,3};//[2,3]
        System.out.println(elementN3.majorityElement(array4));
        int[] array5 = {1,1 ,1, 1, 1, 2, 2};//[1]
        System.out.println(elementN3.majorityElement(array5));
        int[] array6 = { 2, 2};//[2]
        System.out.println(elementN3.majorityElement(array6));
        int[] array7 = { 0,0,0};//[0]
        System.out.println(elementN3.majorityElement(array7));
        int[] array8 = {2,1,1,3,1,4,5,6};//[1]
        System.out.println(elementN3.majorityElement(array8));
        int[] array9 = {1,1,1,2,2,2,3,3,3};//[]
        System.out.println(elementN3.majorityElement(array9));
        int[] array10 = {1,1,2,2,2,2,3,3,3};//[2]
        System.out.println(elementN3.majorityElement(array10));
        int[] array11= {1,2,2,2,2,3,3,3,3};//[2,3]
        System.out.println(elementN3.majorityElement(array11));
        int[] array12= {2,2,2,2,3,3,3,3,3};//[2,3]
        System.out.println(elementN3.majorityElement(array12));
        int[] array13= {1,1 ,1, 1, 1, 2, 2};//[1]
        System.out.println(elementN3.majorityElement(array13));
        int[] array14= {11,33,33,11,33,11};//11 33
        System.out.println(elementN3.majorityElement(array14));
        int[] array15= {3,2,3};//[3]
        System.out.println(elementN3.majorityElement(array15));
        int[] array16= {1};//1
        System.out.println(elementN3.majorityElement(array16));
        int[] array17= {1,2};//1 2
        System.out.println(elementN3.majorityElement(array17));
        int[] array18 = {1,2,2,3, 2};//[2]
        System.out.println(elementN3.majorityElement(array18));
    }
}

