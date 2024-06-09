// Problem Link: https://leetcode.com/problems/move-zeroes/
// Problem Description: Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
import java.util.*;

public class Move_Zeros_To_The_End {
    /*
        Brute Force Approach
        TC -> O(n) + O(x) + O(n - x) => O(2n)
        SC -> O(x)
        where x is the non-zero numbers 
        public static void moveZerosToEnd(int[] nums){
            List<Integer> list = new ArrayList<>();
            for(int num: nums){
                if(num != 0){
                    list.add(num);
                }
            }
            for(int i=0;i<list.size();i++){
                nums[i] = list.get(i);
            }
            for(int i=list.size();i<nums.length;i++){
                nums[i] = 0;
            }
        }
    */

    /*
        Optimal Approach
        TC -> (x) + O(n - x) => O(n)
        SC -> O(1)
    */
    public static void moveZerosToEnd(int[] nums){
        int j = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                j = i;
                break;
            }
        }
        if(j == -1){
            // There are no zeros
            return;
        }
        for(int i=j+1;i<nums.length;i++){
            if(nums[i] != 0){
                swap(nums, i, j);
                j++;
            }
        }
    }

    public static void main(String[] args) {
        // Test Cases
        int[] nums1 = {0,1,0,3,12};
        int[] nums2 = {0};

        moveZerosToEnd(nums1);
        display(nums1);
        moveZerosToEnd(nums2);
        display(nums2);
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void display(int[] arr){
        for(int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
