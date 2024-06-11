/*
    Problem Link: https://leetcode.com/problems/maximum-subarray/
    Problem Name & Number: 53. Maximum Subarray
    Problem Description: Given an integer array nums, find the subarray with the largest sum, and return its sum.
*/

public class Maximum_Subarray_Sum {
    /*
        Brute Force 
        TC -> O(N^3)
        SC -> O(1)
        public static int getMaxSubarraySum(int[] nums){
            int n = nums.length;
            int maxSum = Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                for(int j=i;j<n;j++){
                    int sum = 0;
                    for(int k=i;k<=j;k++){
                        sum += nums[k];
                    }

                    maxSum = Math.max(maxSum, sum);
                }
            }
            return maxSum;
        }
    */

    /*
        Slightly Better Solution Approach then Brute Force 
        TC -> O(N^2)
        SC -> O(1)
        public static int getMaxSubarraySum(int[] nums){
            int n = nums.length;
            int maxSum = Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                int sum = 0;
                for(int j=i;j<n;j++){
                    sum += nums[j];
                    maxSum = Math.max(maxSum, sum);
                }
            }
            return maxSum;
        }
    */

    /*
        Optimal Solution
        Kadane's Algorthm
        TC -> O(N)
        SC -> O(1)
    */
    public static int getMaxSubarraySum(int[] nums){
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE, sum = 0;
        for(int i=0;i<n;i++){
            if(sum + nums[i] < nums[i]){
                sum = nums[i];
            }else{
                sum += nums[i];
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        // Test Cases
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums2 = {1};
        int[] nums3 = {5, 4, -1, 7, 8};

        System.out.println(getMaxSubarraySum(nums1));
        System.out.println(getMaxSubarraySum(nums2));
        System.out.println(getMaxSubarraySum(nums3));
    }
}
