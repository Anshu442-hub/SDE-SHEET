package com.jKm;
public class D3Q5c_Unique_Path {
//    public int uniquePaths(int m, int n) { //success
//        int N=n+m-2;
//        int r=m-1;
//        double res=1;
//        for(int i=1;i<=r;i++)
//            res=res*(N-r+i)/i;
//        return (int)res;
//    }


//        private int uniquePaths(int m, int n) { //success
//        double ans=1;
//        int nn=m+n-2;
//        int r=m-1;
//        for (int i = 1; i <=r ; i++) {
//            ans = ans * (nn - r + i) / i;
//        }
//        return (int)Math.round(ans);
//    }

//        public int uniquePaths(int m, int n) { //success
//        long ans=1;
//        int nn=m+n-2;
//        int r=m-1;
//        for (int i = 1; i <=r ; i++) {
//            ans=ans*(nn-r+i)/i;
//        }
//        return (int)(ans);
//    }


//        public int uniquePaths(int m, int n) {//success
//        double ans=1;
//        int nn=m+n-2;
//        int r=Math.min(m,n)-1;
//        for (int i = 1; i <=r ; i++) {
//            ans=ans*(nn-i+1.0)/i;
//        }
//        return (int)(ans);
//    }

    public int uniquePaths(int m, int n) {//success
        double ans=1;
        int nn=m+n-2;
        int r=Math.min(m,n)-1;
        for (int i = 1; i <=r ; i++) {
            ans=ans*(nn-i+1.0)/i;
        }
        return (int)Math.ceil(ans);

}



    public static void main(String[] args) {
        D3Q5c_Unique_Path uniquePaths=new D3Q5c_Unique_Path();
        System.out.println(uniquePaths.uniquePaths(3,7));
        System.out.println(uniquePaths.uniquePaths(53,4));
        System.out.println(uniquePaths.uniquePaths(4,53));
        System.out.println(uniquePaths.uniquePaths(56,5));
        System.out.println(uniquePaths.uniquePaths(59,5));
        System.out.println(uniquePaths.uniquePaths(19,13));
    }
}
//        28
//        26235
//        26235
//        455126
//        557845
//        86493225
