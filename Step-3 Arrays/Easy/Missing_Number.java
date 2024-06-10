/*
    Problem Link: https://leetcode.com/problems/missing-number/
    Problem Name & Number: 268. Missing Number
    Problem Description: Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
*/

public class Missing_Number {
    /*
        Brute Force Approach
        TC -> O(N^2)
        SC -> O(1)
        public static int findMissingNumber(int[] nums){
            int n = nums.length;
            for(int i=0;i<=n;i++){
                boolean flag = false;
                for(int j=0;j<=n-1;j++){
                    if(nums[j] == i){
                        flag = true;
                        break;
                    }
                }
                if(!flag){
                    return i;
                }
            }
            return -1;
        }
    */

    /*
        Better Approach
        TC -> O(N) + O(N) -> O(2N)
        SC -> O(N)
        public static int findMissingNumber(int[] nums){
            int n = nums.length;
            int[] freq = new int[n + 1];
            for(int num: nums){
                freq[num]++;
            }
            for(int i=0;i<n+1;i++){
                if(freq[i] == 0){
                    return i;
                }
            }
            return -1;
        }
    */

    /*
        Optimal Solution
        TC -> O(N)
        SC -> O(1)
        Let's say if N = 10^5 so ((10^5)(10^5 + 1))/2 -> It will go out of the int memory so we need to take long of even more optimize it. Below is the most optimized version of the code using XOR approach
        public static int findMissingNumber(int[] nums){
            int n = nums.length;
            int sum1 = (n * (n + 1))/2;
            int sum2 = 0;
            for(int num: nums){
                sum2 += num;
            }
            return sum1 - sum2;
        }
    */
    
    /*
        Most Optimal Solution
        TC -> O(N)
        SC -> O(1)
    */
    public static int findMissingNumber(int[] nums){
        int xor1 = 0, xor2 = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            xor1 ^= i;
            xor2 ^= nums[i];
        }
        xor1 ^= n;
        return xor1 ^ xor2;
    }
    
    public static void main(String[] args) {
        int[] nums1 = {3, 0, 1};
        int[] nums2 = {0, 1};
        int[] nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(findMissingNumber(nums1));
        System.out.println(findMissingNumber(nums2));
        System.out.println(findMissingNumber(nums3));
    }
}
