/*
    Problem Link: https://leetcode.com/problems/spiral-matrix/
    Problem Name & Number: 54. Spiral Matrix
    Problem Description: Given an m x n matrix, return all elements of the matrix in spiral order.
*/

import java.util.*;

public class Spiral_Matrix {
    /*
        There are no best, better or optimal solution for this problem
        TC -> O(N x M)
        SC -> O(N x M)
    */
    public static List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;
        List<Integer> list = new ArrayList<>();
        int count = 0, total = n * m;
        while(left <= right && top <= bottom){
            // left -> right
            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++;

            // top -> bottom
            for(int i=top;i<=bottom;i++){
                list.add(matrix[i][right]);
            }
            right--;

            if(top <= bottom){
                // right -> left
                for(int i=right;i>=left;i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left <= right){
                // bottom -> top
                for(int i=bottom;i>=top;i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }
    public static void main(String[] args) {
        // Test Cases
        int[][] matrix1 = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int[][] matrix2 = {{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12}};

        System.out.println(spiralOrder(matrix1));
        System.out.println(spiralOrder(matrix2));
    }
}
