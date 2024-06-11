/*
    Problem Link: https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1
    Problem Title: Longest Sub-Array with Sum K
    Problem Description: Given an array containing N integers and an integer K., Your task is to find the length of the longest Sub-Array with the sum of the elements equal to the given value K.
*/

import java.util.*;

public class Longest_SubArray_With_Given_Sum_K {
    /*
        Brute Force
        TC -> O(N^2)
        SC -> O(1)
        public static int getLongestSubarray(int[] nums, int k){
            int n = nums.length;
            int maxLength = 0;
            for(int i=0;i<n;i++){
                int sum = 0;
                for(int j=i;j<n;j++){
                    sum += nums[j];
                    if(sum == k){
                        maxLength = Math.max(maxLength, j - i + 1);
                    }
                }
            }
            return maxLength;
        }
    */

    /*
        Better Solution if the given array has only non negative numbers. But this is the Optimal Solution if the array has negative numbers also
        TC -> O(NlogM)
        SC -> O(M)
        Where M is the no. of elements in the Map
        public static int getLongestSubarray(int[] nums, int k){
            HashMap<Integer, Integer> map = new HashMap<>();
            int maxLength = 0;
            int n = nums.length;
            int sum = 0;
            map.put(0, -1);
            for(int i=0;i<n;i++){
                sum += nums[i];
                if(map.containsKey(sum - k)){   
                    int length = i - map.get(sum - k);
                    maxLength = Math.max(maxLength, length);
                }
                if(!map.containsKey(sum)){
                    map.put(sum, i);
                }
            }
            return maxLength;
        }
    */


    /*
        Optimal Solution when the array has only non-negative numbers
        TC -> O(2N)
        SC -> O(1)
    */
    public static int getLongestSubarray(int[] nums, int k){
        int left = 0, right = 0;
        int n = nums.length;
        int sum = nums[0];
        int maxLength = 0;
        while(right < n){
            while(left <= right && sum > k){
                sum -= nums[left++];
            }
            if(sum == k){
                maxLength = Math.max(maxLength, right - left + 1);
            }
            right++;
            if(right < n){
                sum += nums[right];
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        // Test Cases
        int[] nums1 = {10, 5, 2, 7, 1, 9};
        int[] nums2 = {-1, 2, 3};
        int k1 = 15, k2 = 6;
        System.out.println(getLongestSubarray(nums1, k1));
        System.out.println(getLongestSubarray(nums2, k2));
    }
}
