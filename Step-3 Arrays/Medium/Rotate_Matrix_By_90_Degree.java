/*
    Problem Link: https://leetcode.com/problems/rotate-image/
    Problem Name & Number: 48. Rotate Image
    Problem Description: You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
                         You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
*/

public class Rotate_Matrix_By_90_Degree {
    /*
        Brute Force
        TC -> O(N^2) + O(N^2) -> O(2N^2) -> O(N^2)
        SC -> O(N^2)
        public static void rotateBy90(int[][] matrix){
            int n = matrix.length;
            int[][] result = new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    result[j][n-i-1] = matrix[i][j];
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    matrix[i][j] = result[i][j];
                }
            }
        }
    */

    // Optimal Solution
    // TC -> O(N^2) + O(N * N/2) -> nearly O(2N^2) -> O(N^2)
    // SC -> O(1)
    public static void rotateBy90(int[][] matrix){
        int n = matrix.length;
        // Transpose
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // Reverse
        for(int[] arr: matrix){
            reverse(arr, 0, n-1);
        }
    }

    public static void reverse(int[] arr, int i, int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotateBy90(matrix);
        display(matrix);
    }

    public static void display(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
