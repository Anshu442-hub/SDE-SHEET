package com.jKm;

import java.util.ArrayList;
import java.util.Arrays;

public class D2Q2A_MergeOverlappingIntervals {
    public  int[][]  merge(int[][] intervals){
        ArrayList<int []>ans=new ArrayList<>();
        if (intervals.length==0||intervals==null){return intervals;}
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int f=intervals[0][0];
        int s=intervals[0][1];
        for (int[]a:intervals) {
            if(s>=a[0]){s= Math.max(s,a[1]);}
            else{
                int[]flag={f,s};
                ans.add(flag);
                f=a[0];
                s=a[1];
            }
        }
        int []flag={f,s};
        ans.add(flag);
        return ans.toArray(new int[0][]);
    }

    public static void main(String[] args) {

        int [][]arr={{1,3},{2,6},{8,10},{15,18}};
        D2Q2A_MergeOverlappingIntervals overlap=new D2Q2A_MergeOverlappingIntervals();
        System.out.println(overlap.merge(arr));



    }


}
