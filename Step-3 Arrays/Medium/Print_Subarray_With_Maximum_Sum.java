/*
    Similar Problem Link: https://leetcode.com/problems/maximum-subarray/
    Problem Name & Number: 53. Maximum Subarray
    Problem Description: Given an integer array nums, find the subarray with the largest sum, and return its sum.
*/

public class Print_Subarray_With_Maximum_Sum {
    /*
        Brute Force
        TC -> O(N^3)
        Sc -> O(1)
        public static void getAndPrintMaxSubarraySum(int[] nums){
            int n = nums.length;
            int maxSum = Integer.MIN_VALUE;
            int maxStart = -1, maxEnd = -1;
            for(int i=0;i<n;i++){
                for(int j=i;j<n;j++){
                    int sum = 0;
                    for(int k=i;k<=j;k++){
                        sum += nums[k];
                    }
                    if(sum > maxSum){
                        maxSum = sum;
                        maxStart = i;
                        maxEnd = j;
                    }
                }
            }
            display(nums, maxStart, maxEnd);
        }
    */

    /*
        Slightly Better Solution than Brute Force Solution
        TC -> O(N^2)
        SC -> O(1)
        public static void getAndPrintMaxSubarraySum(int[] nums){
            int n = nums.length;
            int maxSum = Integer.MIN_VALUE;
            int maxStart = -1, maxEnd = -1;
            for(int i=0;i<n;i++){
                int sum = 0;
                for(int j=i;j<n;j++){
                    sum += nums[j];
                    if(sum > maxSum){
                        maxSum = sum;
                        maxStart = i;
                        maxEnd = j;
                    }
                }
            }
            display(nums, maxStart, maxEnd);
        }
    */

    /*
        Optimal Solution
        Kadane's Algorithm
        Tc -> O(N)
        SC -> O(1)
    */
    public static void getAndPrintMaxSubarraySum(int[] nums){
        int maxSum = Integer.MIN_VALUE, sum = 0;
        int n = nums.length;
        int maxStart = 0, maxEnd = -1;
        for(int i=0;i<n;i++){
            if(sum + nums[i] < nums[i]){
                sum = nums[i];
                maxStart = i;
            }else{
                sum += nums[i];
            }

            if(sum > maxSum){
                maxSum = sum;
                maxEnd = i;
            }
        }
        display(nums, maxStart, maxEnd);
    }

    public static void main(String[] args) {
        // Test Cases
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums2 = {1};
        int[] nums3 = {5, 4, -1, 7, 8};

        getAndPrintMaxSubarraySum(nums1);
        getAndPrintMaxSubarraySum(nums2);
        getAndPrintMaxSubarraySum(nums3);
    }

    public static void display(int[] nums, int start, int end){
        System.out.print("Subarray with Maximum Sum is {");
        for(int i=start;i<=end;i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println("}");
    }
}
