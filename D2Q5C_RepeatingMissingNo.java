package com.jKm;
public class D2Q5C_RepeatingMissingNo {
    public static int[] Sol(int []arr){
        int n= arr.length;
        int x=0,y=0,i=0;
        int res=arr[0];
        for ( i = 1; i < n; i++) {  //xor elements of arr
            res=res^arr[i];
        }
        System.out.println("res after xoring array elements= "+res);
        for ( i = 1; i <= n; i++) {    //xor nos from 1 to n
            res=res^i;
        }
        System.out.println("res after xoring nos from 1 to n and res = "+res);
        int set_bit_no = res & ~(res - 1);
        System.out.println("set_bit_no  = "+set_bit_no);
        for (i = 0; i < n; i++) {
            if ((arr[i] & set_bit_no) != 0) {
                x = x ^ arr[i];
            }
            else {
                y = y ^ arr[i];
            }
        }
        for (i = 1; i <= n; i++) {
            if ((i & set_bit_no) != 0) {
                x = x ^ i;
            }
            else {
                y = y ^ i;
            }
        }
        System.out.println("x(may be missing or repeating)= " + x+" y(may be missing or repeating)= " + y);
        int[] ans=new int[2];
        for (int j = 0; j < n; j++) {
            if (arr[j]==y){
                ans[0]=x;ans[1]=y;
            }else if (arr[j]==x){
                ans[0]=y;ans[1]=x;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
//        int arr[] = {1, 3, 4, 5, 1, 6, 2};
      int[] arr = {3,4, 7, 5, 7, 6, 2};
//      int[] arr = {3,1,2,5,4,6,7,5};
//        int[] arr = {4,3,6,2,1,1};
//        int[] arr = {3,1,2,5,3};
        int[] ans=Sol(arr);
        System.out.println(" The missing element =  " + ans[0]);
        System.out.println(" The repeating  element =  " + ans[1]);
    }
}
