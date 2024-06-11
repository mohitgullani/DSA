/*
    Problem Link: https://leetcode.com/problems/sort-colors/
    Problem Name & Number: 75. Sort Colors
    Problem Description: Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
                         We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
                         You must solve this problem without using the library's sort function.
*/

public class Sort_0s_1s_2s {
    /*
        Brute Force
        TC -> O(2N)
        SC -> O(1)
        public static void sortArray(int[] nums){
            int[] count = new int[3];
            for(int num: nums){
                if(num == 0){
                    count[0]++;
                }else if(num == 1){
                    count[1]++;
                }else{
                    count[2]++;
                }
            }
            int i = 0;
            for(int j=0;j<count[0];j++) nums[i++] = 0;
            for(int j=0;j<count[1];j++) nums[i++] = 1;
            for(int j=0;j<count[2];j++) nums[i++] = 2;
        }
    */

    /*
        Optimal Solution
        Dutch National Flag Algorithm
        _____________________________________
       | 0         |   low - 1  |   Sorted   |
       | low       |   mid - 1  |   Sorted   |
       | mid       |   high     |   Unsorted |
       | high + 1  |   n - 1    |   Sorted   |

       TC -> O(N)
       SC -> O(1)
    */
    public static void sortArray(int[] nums){
        int low = 0, mid = 0, high = nums.length-1;
        while(mid<=high){
            if(nums[mid] == 0){
                swap(nums, mid, low);
                mid++;
                low++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                swap(nums, mid, high);
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 0, 2, 1, 1, 0};
        int[] nums2 = {0, 1, 2};
        int[] nums3 = {2, 2, 2, 1, 1, 0, 1, 2, 0, 0, 1, 1, 0};
        sortArray(nums1);
        display(nums1);
        sortArray(nums2);
        display(nums2);
        sortArray(nums3);
        display(nums3);
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void display(int[] nums){
        for(int num: nums){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
