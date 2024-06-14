// Problem Link: https://leetcode.com/problems/pascals-triangle/
// Problem Name and Number: 118. Pascal's Triangle

import java.util.*;

public class Pascals_Triangle {
    /*
        Brute Force
        TC -> O(n * n * r)
        SC -> (N) for the innerList, I am not including the list to return the answer because I am using list to store the answer not to solve the problem
        public static List<List<Integer>> generate(int numRows) {
            List<List<Integer>> list = new ArrayList<>();
            for(int i=1;i<=numRows;i++){
                List<Integer> innerList = new ArrayList<>();
                for(int j=1;j<=i;j++){
                    innerList.add(nCr(i-1, j-1));
                }
                list.add(innerList);
            }
            return list;
        }

        TC -> O(r)
        SC -> O(1)
        public static int nCr(int n, int r){
            int result = 1;
            for(int i=0;i<r;i++){
                result *= (n - i);
                result /= (i + 1);
            }
            return result;
        }
    */

    // TC -> O(N)
    public static List<Integer> getNthRow(int n){
        List<Integer> list = new ArrayList<>();
        int result = 1;
        list.add(1);
        for(int i=0;i<n;i++){
            result *= (n - i);
            result /= (i + 1);
            list.add(result);
        }
        return list;
    }

    /*
        Optimal Solution
        TC -> O(N * N)
        SC -> O(1)
    */
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            list.add(getNthRow(i - 1));
        }
        return list;
    }

    public static void main(String[] args) {
        // Test Cases
        int n1 = 5;
        int n2 = 7;

        System.out.println(generate(n1));
        System.out.println(generate(n2));
    }
}
