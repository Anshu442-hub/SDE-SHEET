package com.jKm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class D1Q2C_PascalTriangle {
    public List<List<Integer>> Triangle(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> row, pre = null;
//      System.out.println(pre);
        for (int i = 0; i < numRows; ++i) {
            row = new ArrayList<Integer>();
            for (int j = 0; j <= i; ++j) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(pre.get(j - 1) + pre.get(j));
                }
            }
//          System.out.println(pre);
            pre = row;
            res.add(row);
        }
//      System.out.println(res);
        return res;
    }
    public static void main(String[] args) {
        D1Q2C_PascalTriangle triangle = new D1Q2C_PascalTriangle();
        List<List<Integer>> tri = triangle.Triangle(7);
        Iterator var3 = tri.iterator();

        while(var3.hasNext()) {
            List<Integer> row = (List)var3.next();
            Iterator var5 = row.iterator();

            while(var5.hasNext()) {
                int ele = (Integer)var5.next();
                System.out.print(ele + " ");
            }

            System.out.println();
        }

    }
}