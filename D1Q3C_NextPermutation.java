package com.jKm;
import java.util.Arrays;
public class D1Q3C_NextPermutation {
    public void nextPermutation(int[] nums) {
        int n= nums.length;
        if(n == 0 ||n <= 1) return;
        int i = n - 2;
//        while(i >= 0 && nums[i] >= nums[i + 1]) i--;
        for ( i = n-2;( i >=0&& nums[i] >= nums[i + 1]); i--);

        if(i >= 0) {
            int j = n- 1;
            while(nums[j] <= nums[i]) j--;
            swap(nums, i, j);
        }
        reverse(nums, i + 1, n - 1);

        System.out.println(Arrays.toString(nums));
    }

    public void swap(int arr[],int a,int b){
        int temp=0;
        temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;}
    public void reverse(int[] arr,int a,int b) {

        while (a<b) {
            int temp = arr[a];
            arr[a] = arr[b ];
            arr[b ] = temp;
            a++;b--;
//            swap(arr,a++,b--);
        }
    }
    public static void main(String[] args) {
        int []arr1={1,3,5,4,2}; //[1, 4, 2, 3, 5]
        int []arr2={45};
        int []arr3={0};
        int []arr4={};
        int []arr5={1,3,2}; //[2, 1, 3]
        int []arr6={3,2,1}; //[1, 2, 3]
//
        System.out.println(Arrays.toString(arr1)+"ooriginal");
        D1Q3C_NextPermutation next=new D1Q3C_NextPermutation();
        next.nextPermutation(arr1);
        next.nextPermutation(arr2);
        next.nextPermutation(arr3);
        next.nextPermutation(arr4);
        next.nextPermutation(arr5);
        next.nextPermutation(arr6);
//
//        D1Q3C_NextPermutation swap=new D1Q3C_NextPermutation();
//        D1Q3C_NextPermutation reverse=new D1Q3C_NextPermutation();
//        System.out.println(Arrays.toString(arr1));
//        swap.swap(arr1,1,3);
//        reverse.reverse(arr1,2, arr1.length+1);

    }
}
