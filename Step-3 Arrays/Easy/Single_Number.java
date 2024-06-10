// Problem Link: https://leetcode.com/problems/single-number/
// Problem Name & Number: 136. Single Number
// Problem Description: Given a non-empty array of integers nums, every element appears twice except for one. Find that single one. You must implement a solution with a linear runtime complexity and use only constant extra space.

import java.util.*;

public class Single_Number {
    /*
        Brute Force Approach
        TC -> O(N^2)
        SC -> O(1)
        public static int getSingleNumber(int[] nums){
            for(int num1: nums){
                int count = 0;
                for(int num2: nums){
                    if(num1 == num2){
                        count++;
                    }
                }
                if(count == 1){
                    return num1;
                }
            }
            return -1;
        }
    */

    /*
        Better Approach
        TC -> O(N) + O(N) + O(N) -> O(3N)
        SC -> O(max(nums))
        If the max Element is higher than 10^6 or 10^7, this method won't work
        public static int getSingleNumber(int[] nums){
            int max = Integer.MIN_VALUE;
            for(int num: nums){
                max = Math.max(max, num);
            }
            int[] hash = new int[max + 1];
            for(int num: nums){
                hash[num]++;
            }
            for(int num: nums){
                if(hash[num] == 1){
                    return num;
                }
            }
            return -1;
        }
    */

    /*
        Slightly Better Solution
        TC -> O(NlogM) + O(N)
        SC -> O(M)
        Where M is the Elements inside Map Data structures or the unique elements in the array, M = (N/2) + 1
        public static int getSingleNumber(int[] nums){
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int num: nums){
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            for(int key: map.keySet()){
                if(map.get(key) == 1){
                    return key;
                }
            }
            return -1;
        }
    */

    /*
        Most Optimal Solution using XOR
        TC -> O(N)
        SC -> O(1)
    */
    public static int getSingleNumber(int[] nums){
        int xor = 0;
        for(int num: nums){
            xor ^= num;
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 2, 1};
        int[] nums2 = {4, 1, 2, 1, 2};
        int[] nums3 = {1};
        System.out.println(getSingleNumber(nums1));
        System.out.println(getSingleNumber(nums2));
        System.out.println(getSingleNumber(nums3));
    }
}
