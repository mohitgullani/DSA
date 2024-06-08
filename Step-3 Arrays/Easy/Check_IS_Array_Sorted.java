// Similar Problem Link: https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/

import java.util.*;

public class Check_IS_Array_Sorted {
    /* 
        There is no brute force, better solution or optimal for this problem
        Tc -> O(N);
        SC -> O(1);
    */
    public static boolean isArraySorted(int[] arr, int n){
        for(int i=1;i<n;i++){
            if(arr[i-1] > arr[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        boolean sorted = isArraySorted(arr, n);
        if(sorted){
            System.out.println("Array is sorted!");  
        }else{
            System.out.println("Array is not sorted!");
        }
    }
    
}
