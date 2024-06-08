/*
    Problem 26 on Leetcode: Remove Duplicates from Sorted Array:-
    Problem Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
*/


import java.util.*;

public class Remove_Duplicates {
    /*
        Brute Force Approach
        TC -> O(N) + O(N) -> O(2N)
        SC -> O(N)
        public static int removeDuplicates(int[] arr){
            HashSet<Integer> set = new HashSet<>();
            for(int num: arr){
                set.add(num);
            }

            int i=0;
            for(int num: set){
                arr[i++] = num;
            }
            return i;
        }
    */

    // There is not Better Approach
    
    /*
        Optimal Approach
        TC -> O(N)
        SC -> O(1)
    */
    public static int removeDuplicates(int[] arr){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i] != arr[j]){
                arr[++i] = arr[j];
            }
        }
        return ++i;
    }

    public static void main(String[] args) {
        // Test Cases
        int[] arr1 = {1, 1, 2} ;
        int[] arr2 = {0,0,1,1,1,2,2,3,3,4};
        
        System.out.println("Unique Elements: " + removeDuplicates(arr1));
        System.out.println("Unique Elements: " + removeDuplicates(arr2));
    }
}
