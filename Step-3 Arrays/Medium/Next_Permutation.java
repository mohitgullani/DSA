/*
    Problem Link: https: leetcode.com/problems/next-permutation/
    Problem Name & Number: 31. Next Permutation
*/

public class Next_Permutation {
    /*
        Brute Force
        Generate all permutations and sort -> O(N! x N), where N! for generating all permutations and each permutation is of length N
        Perform Linear Search
        If find return the next permutation.
    */

    /*
        Optimal Solution
        TC -> O(N) + O(N) + O(N) -> O(3N)
        SC -> O(1)
    */
    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;
        for(int i=n-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                index = i;
                break;
            }
        }
        if(index == -1){
            reverse(nums, 0, n - 1);
            return;
        }

        for(int i=n-1;i>index;i--){
            if(nums[i] > nums[index]){
                swap(nums, i, index);
                break;
            }
        }
        reverse(nums, index+1, n-1);
    }

    public static void main(String[] args) {
        // Test Cases
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {3, 2, 1};
        int[] nums3 = {1, 1, 5};

        nextPermutation(nums1);
        display(nums1);
        nextPermutation(nums2);
        display(nums2);
        nextPermutation(nums3);
        display(nums3);
    }

    public static void display(int[] nums){
        for(int num: nums){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
