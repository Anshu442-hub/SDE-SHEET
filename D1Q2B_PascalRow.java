package com.jKm;
public class D1Q2B_PascalRow {
    public static void pt(int r){
        int p=1;
        for (int i = 0; i <= r-1; i++) {
            if(i==0) p=1;
            else
                p=(p*(r-i))/i;
            System.out.print(p+" ");
        }
    }
    public static void main(String[] args) {
        int r=8;
        D1Q2B_PascalRow row=new D1Q2B_PascalRow();
        System.out.print(r+"th row in pascal triangle is : ");
        row.pt(r);
    }
}
