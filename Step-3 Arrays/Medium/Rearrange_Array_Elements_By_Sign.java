/*
    Problem Link: https://leetcode.com/problems/rearrange-array-elements-by-sign/
    Problem Name & Number: 2149. Rearrange Array Elements by Sign
    Problem Description: You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.
                         You should return the array of nums such that the the array follows the given conditions:
                         Every consecutive pair of integers have opposite signs.
                         For all integers with the same sign, the order in which they were present in nums is preserved.
                         The rearranged array begins with a positive integer.
                         Return the modified array after rearranging the elements to satisfy the aforementioned conditions.
*/

import java.util.ArrayList;
import java.util.List;

public class Rearrange_Array_Elements_By_Sign {
    /*
        Brute Force Approach
        TC -> O(N) + O(N/2) -> O(2N) approx
        SC -> O(N/2) + O(N/2) -> O(N)
        public static int[] rearrangeArray(int[] nums) {
            int n = nums.length;
            List<Integer> pos = new ArrayList<>();
            List<Integer> neg = new ArrayList<>();
            for(int num: nums){
                if(num < 0){
                    neg.add(num);
                }else{
                    pos.add(num);
                }
            }
            for(int i=0;i<n/2;i++){
                nums[2 * i] = pos.get(i);
                nums[2 * i + 1] = neg.get(i);
            }
            return nums;
        }
    */

    /*
        Optimal Solution
        TC -> O(N)
        SC -> O(1)
    */
    public static int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int posIndex = 0, negIndex = 1;
        for(int num: nums){
            if(num < 0){
                result[negIndex] = num;
                negIndex += 2;
            }else{
                result[posIndex] = num;
                posIndex += 2;
            }
        }
        return result;
    }

    /*
        When we have given that positives and negatives are not equal then call this function
        TC -> O(N) + O(N) -> O(2N)
        SC -> O(N)
    */
    public static int[] rearrangeArrayVariant2(int[] nums) {
        int n = nums.length;
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for(int num: nums){
            if(num < 0){
                neg.add(num);
            }else{
                pos.add(num);
            }
        }
        if(pos.size() < neg.size()){
            for(int i=0;i<pos.size();i++){
                nums[2 * i] = pos.get(i);
                nums[2 * i + 1] = neg.get(i);
            }
            int index = 2 * pos.size();
            for(int i=pos.size();i<neg.size();i++){
                nums[index++] = neg.get(i);
            }
        }else{
            for(int i=0;i<neg.size();i++){
                nums[2 * i] = pos.get(i);
                nums[2 * i + 1] = neg.get(i);
            }
            int index = 2 * neg.size();
            for(int i=neg.size();i<pos.size();i++){
                nums[index++] = pos.get(i);
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        // Test Cases
        int[] nums1 = {3, 1, -2, -5, 2, -4};
        int[] nums2 = {-1, 1};

        int[] result1 = rearrangeArray(nums1);
        display(result1);
        int[] result2 = rearrangeArray(nums2);
        display(result2);

        int[] nums3 = {3, 1, -2, -5, 2, -4, 5, 6};
        int[] result3 = rearrangeArrayVariant2(nums3);
        display(result3);
    }

    public static void display(int[] nums){
        for(int num: nums){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
