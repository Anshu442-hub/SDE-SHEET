package com.jKm;

public class D3Q2A_Pow_x_n {
    public double myPow(double x, int n) { //TLE
            double ans=1;
            long m=n;
            if (n<0) m=-n;
            for (int i = 1; i <=m; i++) {
                ans*=x;
            }
            if (n<0) return 1.0/ans;
            return ans;
//       return Math.pow(x,n);
        }

        public static void main(String[] args) {
            D3Q2A_Pow_x_n pow_x_n=new D3Q2A_Pow_x_n();

            double x1=2.00000;
            int n1=10;
            System.out.println(pow_x_n.myPow(x1,n1));
            double x2=2.10000;
            int n2=3;
            System.out.println(pow_x_n.myPow(x2,n2));
//            double x3=2.00000;
//            int n3=10;
//            System.out.println(pow_x_n.myPow(x3,n3));
            double x4=2.00000;
            int n4=-2;
            System.out.println(pow_x_n.myPow(x4,n4));
        }
    }