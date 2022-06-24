package com.jKm;
import java.util.Arrays;
public class D3Q6B_CountReversePairs {
    private int merge(int[] arr, int l, int m, int h) {
        int a[]=new int[m-l+1];
        int b[]=new int[h-m];//h-m=h-(m+1)+1
        int left=l,right=m+1;
        int count=0;

        for (int i =0 ; i < a.length ; i++) {
            a[i]=arr[left++];
        }
        for (int i =0 ; i < b.length ; i++) {
            b[i]=arr[right++];
        }
        //counting
        int i=0,j=0,x=l;
        while (i< a.length&&j< b.length){
            if ((long)a[i]>(2*(long)b[j])){
                count+=(a.length-i);j++;
            }else
                i++;
        }
        //merging
        i=0;j=0;x=l;
        while (i< a.length&&j< b.length){
            if (a[i]<b[j])
                arr[x++]=a[i++];
            else
                arr[x++]=b[j++];
        }
        while (i< a.length)
            arr[x++]=a[i++];
        while (j< b.length)
            arr[x++]=b[j++];

        return count;
    }
    private int sort(int[] arr, int l, int h) {
        int m=l+(h-l)/2;
        if (l==h) return 0;
        int count= sort(arr, l, m);
        count+=sort(arr,m+1,h);
        count+=merge(arr,l,m,h);
        return count;
    }
    public int reversePairs(int[] nums) {
        int count=0;

        count=sort(nums, 0, nums.length - 1);

        return count;
    }
    public static void main(String args[]) {
        int arr1[] = {1,3,2,3,1};  //2
        int arr2[] ={2,4,3,5,1}; //3
        int arr3[] ={2147483647,2147483647,2147483647
                ,2147483647,2147483647,2147483647};    //0
        int arr4[] = {3,2,1,4};//1
        int arr5[] = { 12, 11, 13, 5, 6, 7 };//4
        int arr6[] = { 40,25,19,12,9,6,2 };//15
        int arr7[] = {1, 3, 2, 3, 1};//2
        int arr8[] ={2,4,3,5,1};//3/


        D3Q6B_CountReversePairs ob = new D3Q6B_CountReversePairs();
//        System.out.println("Given Array");
//        System.out.println(Arrays.toString(arr));
        System.out.println(ob.reversePairs(arr1));
        System.out.println(ob.reversePairs(arr2));
        System.out.println(ob.reversePairs(arr3));
        System.out.println(ob.reversePairs(arr4));
        System.out.println(ob.reversePairs(arr5));
        System.out.println(ob.reversePairs(arr6));
        System.out.println(ob.reversePairs(arr7));
        System.out.println(ob.reversePairs(arr8));

//        System.out.println("\nSorted array");
//        System.out.println(Arrays.toString(arr));

    }


}
