// Problem Link: https://www.geeksforgeeks.org/problems/largest-element-in-array4009/0

import java.util.*;

public class Largest_Element {
    /* 
        Brute Force Solution
        TC -> O(NlogN)
        SC -> Depends on the sorting algorithm if we are using merge sort, then the SC would be O(N), if we are using quick sort, then it would be O(1)
        public static int getLargest(int[] arr, int n){
            Arrays.sort(arr);
            return arr[n - 1];
        }
    */
    
    /* No Better Solution for this question */

    /*
        Optimal Solution
        TC -> O(N)
        SC -> O(1) 
    */
    public static int getLargest(int[] arr, int n){
        int largest = Integer.MIN_VALUE;
        for(int num: arr){
            if(num > largest){
                largest = num;
            }
        }
        return largest;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int largest = getLargest(arr, n);
        System.out.println("Largest Element: " + largest);
    }
}
