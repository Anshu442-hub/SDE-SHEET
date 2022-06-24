package com.jKm;

public class D2Q6C_InversionOfArray {
    public static long getInversions(long[] arr, int n) {
        long x = msort(arr, 0, arr.length - 1);
        return x;
    }
    public static long msort(long[] arr, int low, int high) {
        long c = 0L;
        if (low < high) {
            int mid = low + (high - low) / 2;
            c += msort(arr, low, mid);
            c += msort(arr, mid + 1, high);
            c += mergerFun(arr, low, mid, high);
        }

        return c;
    }
    private static long mergerFun(long[] arr, int low, int mid, int high) {
        long res = 0L;
        int n = mid - low + 1;
        int m = high - mid;
        long[] temp1 = new long[n];
        long[] temp2 = new long[m];
        int i;
        int left=low;int right=mid+1; //more easier one
        for(i = 0; i < n; i++) {
            temp1[i] = arr[left++];
        }
        for(i = 0; i < m; i++) {
            temp2[i] = arr[right++];
        }

//        for(i = 0; i < n; ++i) { //difficult to rembeber
//            temp1[i] = arr[low + i];
//        }
//        for( i = 0; i < m; ++i) {
//            temp2[i] = arr[mid + 1 + i];
//        }


        i = 0;
        int j = 0;
        int var12 = low;
        while(i < n && j < m) {
            if (temp1[i] <= temp2[j]) {
                arr[var12++] = temp1[i++];
            } else {
                arr[var12++] = temp2[j++];
                res += (long)(n - i);
            }
        }
        while(i < n) {
            arr[var12++] = temp1[i++];
        }
        while(j < m) {
            arr[var12++] = temp2[j++];
        }
        return res;
    }







    public static void main(String[] args) {
        long []arr={1,2,3,4,5};
        int n= arr.length;
        System.out.println(getInversions(arr,n));
        long []arr2={5,4,3,2,1};
        int n2= arr2.length;
        System.out.println(getInversions(arr2,n2));
        long []arr3={5,3,2,1,4};
        int n3= arr3.length;
        System.out.println(getInversions(arr3,n3));
    }

//    private static long mergerFun(long[] arr, int low, int mid, int high) {
//        long res = 0L;
//        int n = mid - low + 1;
//        int m = high - mid;
//        long[] temp1 = new long[n];
//        long[] temp2 = new long[m];
//        int i;
//        for(i = 0; i < n; ++i) {
//            temp1[i] = arr[low + i];
//        }
//        for(i = 0; i < m; ++i) {
//            temp2[i] = arr[mid + 1 + i];
//        }
//        i = 0;
//        int j = 0;
//        int var12 = low;
//        while(i < n && j < m) {
//            if (temp1[i] <= temp2[j]) {
//                arr[var12++] = temp1[i++];
//            } else {
//                arr[var12++] = temp2[j++];
//                res += (long)(n - i);
//            }
//        }
//        while(i < n) {
//            arr[var12++] = temp1[i++];
//        }
//        while(j < m) {
//            arr[var12++] = temp2[j++];
//        }
//        return res;
//    }


}
