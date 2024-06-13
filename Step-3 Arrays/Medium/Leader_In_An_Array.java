/*
    Problem Link: https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1
    Problem Name: Leaders in an array
    Problem Description: Given an array arr[] of n positive integers. Your task is to find the leaders in the array. 
                         An element of the array is a leader if it is greater than all the elements to its right side or 
                         if it is equal to the maximum element on its right side. The rightmost element is always a leader. 
*/

import java.util.*;

public class Leader_In_An_Array {
    /*
        Brute Force
        TC -> O(N^2)
        SC - O(1), I am not using list to solve the problem, I am just using it to store the answers!
        public static List<Integer> getLeaders(int[] nums){
            int n = nums.length;
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<n;i++){
                boolean leader = true;
                for(int j=i+1;j<n;j++){
                    if(nums[j] > nums[i]){
                        leader = false;
                        break;
                    }
                }
                if(leader)    list.add(nums[i]);
            }
            return list;
        }
    */

    /*
        Optimal Solution
        TC -> O(N)
        SC - O(1), I am not using list to solve the problem, I am just using it to store the answers!
    */
    public static List<Integer> getLeaders(int[] nums){
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(nums[i] >= max){
                list.add(0, nums[i]);
            }
            max = Math.max(max, nums[i]);
        }
        return list;
    }
    public static void main(String[] args) {
        // Test Cases
        int[] nums1 = {16, 17, 4, 3, 5, 2};
        int[] nums2 = {10, 4, 2, 4, 1};
        int[] nums3 = {5, 10, 20, 40};
        int[] nums4 = {30, 10, 10, 5};

        System.out.println(getLeaders(nums1));
        System.out.println(getLeaders(nums2));
        System.out.println(getLeaders(nums3));
        System.out.println(getLeaders(nums4));
    }
}
