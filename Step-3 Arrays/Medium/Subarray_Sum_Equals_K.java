/*
    Problem Link: https://leetcode.com/problems/subarray-sum-equals-k/
    Problem Name & Number: 560. Subarray Sum Equals K
    Problem Description: Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
                         A subarray is a contiguous non-empty sequence of elements within an array.
*/

import java.util.*;

public class Subarray_Sum_Equals_K {
    /*
        Brute Force
        TC -> O(N^3)
        SC -> O(1)
        public static int subarraySum(int[] nums, int k) {
            int count = 0;
            int n = nums.length;
            for(int i=0;i<n;i++){
                for(int j=i;j<n;j++){
                    int sum = 0;
                    for(int z=i;z<=j;z++){
                        sum += nums[z];
                    }
                    if(sum == k){
                        count++;
                    }
                }
            }
            return count;
        }
    */

    /*
        Better Solution
        TC -> O(N^2)
        SC -> O(1)
        public static int subarraySum(int[] nums, int k) {
            int count = 0;
            int n = nums.length;
            for(int i=0;i<n;i++){
                int sum = 0;
                for(int j=i;j<n;j++){
                    sum += nums[j];
                    if(sum == k){
                        count++;
                    }
                }
            }
            return count;
        }
    */


    /*
        Optimal solution
        TC -> O(N) Assuming there are no collisions in the map
        SC -> O(N)
    */
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, count = 0;
        map.put(0, 1);
        for(int num: nums){
            sum += num;
            if(map.containsKey(sum - k)){
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 1};
        int[] nums2 = {1, 2, 3};
        int[] nums3 = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3};

        int k1 = 2, k2 = 3, k3 = 3;

        System.out.println(subarraySum(nums1, k1));
        System.out.println(subarraySum(nums2, k2));
        System.out.println(subarraySum(nums3, k3));
    }
}
