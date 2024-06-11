/*
    Problem Link: https://leetcode.com/problems/majority-element/
    Problem Name & Number: 169. Majority Element
    Problem Description: Given an array nums of size n, return the majority element.
                        The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
*/

import java.util.*;

public class Majority_Element {
    /*
        Brute Force
        TC -> O(N^2)
        SC -> O(1)
        public static int majorityElement(int[] nums){
            int n = nums.length;
            for(int i=0;i<n;i++){
                int count = 0;
                for(int j=0;j<n;j++){
                    if(nums[i] == nums[j]){
                        count++;
                    }
                }
                if(count > (n/2)){
                    return nums[i];
                }
            }
            return -1;
        }
    */

    /*
        Better Solution
        TC -> O(NlogN) + O(N)
        SC -> O(N), if all elements are unique
        public static int majorityElement(int[] nums){
            int n = nums.length;
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int num: nums){
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            for(int key: map.keySet()){
                if(map.get(key) > (n/2)){
                    return key;
                }
            }
            return -1;
        }
    */

    /*
        Optimal Solution
        Moore's Voting Algorithm
        TC -> O(N) + O(N) -> O(2N)
        SC -> O(1)
    */
    public static int majorityElement(int[] nums){
        int n = nums.length;
        int element = 0, count = 0;
        for(int num: nums){
            if(count == 0){
                element = num;
                count = 1;
            }else if(num == element){
                count++;
            }else{
                count--;
            }
        }
        int count2 = 0;
        for(int num: nums){
            if(num == element){
                count2++;
            }
        }
        if(count2 > (n/2)){
            return element;
        }
        return -1;
    }
    public static void main(String[] args) {
        // Test Cases
        int[] nums1 = {3, 2, 3};
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        int[] nums3 = {7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5, 5};
        System.out.println(majorityElement(nums1));
        System.out.println(majorityElement(nums2));
        System.out.println(majorityElement(nums3));
    }
}
