/*
    Problem Link: https://leetcode.com/problems/set-matrix-zeroes/
    Problem Name & Number: 73. Set Matrix Zeroes
    Problem Description: Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0s
                         You must do it in place.
*/
public class Set_Matrix_Zeros {
    /*
        Brute Force
        TC -> O(N x M)(N + M) + O(N x M) -> Nearly O(N^3)
        SC -> O(1)
        public static void setZeroes(int[][] matrix) {
            int n = matrix.length;
            int m = matrix[0].length;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(matrix[i][j] == 0){
                        markRow(matrix, i);
                        markCol(matrix, j);
                    }
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(matrix[i][j] == -1){
                        matrix[i][j] = 0;
                    }
                }
            }
            display(matrix);
        }

        public static void markRow(int[][] matrix, int row){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[row][j] != 0){
                    matrix[row][j] = -1;
                }
            }
        }

        public static void markCol(int[][] matrix, int col){
            for(int i=0;i<matrix.length;i++){
                if(matrix[i][col] != 0){
                    matrix[i][col] = -1;
                }
            }
        }
    */

    /*
        Better Solution
        TC -> O(N^2) + O(N^2) -> O(2N^2)
        SC -> O(N + M)
        public static void setZeroes(int[][] matrix) {
            int n = matrix.length;
            int m = matrix[0].length;
            int[] col = new int[m];
            int[] row = new int[n];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(matrix[i][j] == 0){
                        row[i] = 1;
                        col[j] = 1;
                    }
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(row[i] == 1 || col[j] == 1){
                        matrix[i][j] = 0;
                    }
                }
            }
            display(matrix);
        }
    */

    /*
        Optimal Solution
        TC -> O(N^2) + O(N^2) -> O(N^2) -> O(N^2)
        SC -> O(1)
    */
    public static void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int col0 = 1;
        // int[] col = new int[m]; -> matrix[0][.]
        // int[] row = new int[n]; -> matrix[.][0]
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    if(j != 0)
                        matrix[0][j] = 0;
                    else
                        col0 = 0;
                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        if(matrix[0][0] == 0){
            for(int j=0;j<m;j++){
                matrix[0][j] = 0;
            }
        }

        if(col0 == 0){
            for(int i=0;i<n;i++){
                matrix[i][0] = 0;
            }
        }
        display(matrix);
    }

    public static void main(String[] args) {
        int[][] matrix1 = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] matrix2 = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};

        setZeroes(matrix1);
        setZeroes(matrix2);
    }

    public static void display(int[][] matrix){
        System.out.println("-------------------------------------------");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------");
    }

}
