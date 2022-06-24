package com.jKm;

public class D3Q2B_Pow_x_n {
    public double myPow(double x, int n) {
        double ans=1.0;
        long m=n;
        if (n<0)m=-m; //making m positive if m is negative

        while(m>0){
            if(m%2==0){
                x*=x;
                m/=2;
            }else {
                ans*=x;
                m--;
            }
        }
        if (n<0) return (double) (1.0)/(double)(ans);
        return ans;
    }
    public static void main(String[] args) {
        D3Q2B_Pow_x_n pow_x_n=new D3Q2B_Pow_x_n();
        double x1=2.00000;
        int n1=-2147483648;
        System.out.println(pow_x_n.myPow(x1,n1));//0.0

        double x2=2.10000;
        int n2=3;
        System.out.println(pow_x_n.myPow(x2,n2));//9.2610000

        double x3=2.00000;
        int n3=10;
        System.out.println(pow_x_n.myPow(x3,n3)); //1024.00000

        double x4=2.00000;
        int n4=-2;
        System.out.println(pow_x_n.myPow(x4,n4));//0.250000
    }

}
