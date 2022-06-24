package com.jKm;

public class D2Q5B_RepeatingMissingNo {
    public static int[] Sol(int [] arr){
        int n=arr.length;

        int sum=n*(n+1)/2;
        int sq=n*(n+1)*(2*n+1)/6;

        int arraySum=0,arraySqSum=0;
//        System.out.println("sum= "+sum);
//        System.out.println("sq sum = "+sq);

        for (int i = 0; i < n; i++) {
            arraySum=arraySum+arr[i];
            arraySqSum=arraySqSum+(arr[i]*arr[i]);
        }
       int a=sum-arraySum;
//        System.out.println("a= "+a);
        int a2=sq-arraySqSum;
//        System.out.println(" a2= "+a2);

        int missing=(a+(a2/a))/2;
//        System.out.println(" missing= "+missing);

        int repeating=missing-a ;
//        System.out.println(" repeating= "+repeating);

        int[] ans=new int[2];
        ans[0]=missing;
        ans[1]=repeating;
        return ans;
    }



    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 5, 1, 6, 2};
//      int[] arr = {3,4, 7, 5, 7, 6, 2};
//      int[] arr = {3,1,2,5,4,6,7,5};
//        int[] arr = {4,3,6,2,1,1};
//        int[] arr = {3,1,2,5,3};
        int[] ans=Sol(arr);
        System.out.println(" The missing element =  " + ans[0]);
        System.out.println(" The repeating  element =  " + ans[1]);
    }
}
