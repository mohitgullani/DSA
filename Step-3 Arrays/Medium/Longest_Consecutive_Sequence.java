import java.util.*;

public class Longest_Consecutive_Sequence {
    /*
        Brute Force
        TC -> O(N^2)
        SC -> O(1)
        public static int getLongestConsecutiveSequence(int[] nums){
            int longest = 1;
            for(int num: nums){
                int x = num;
                int count = 1;
                while(linearSearch(nums, x + 1)){
                    x += 1;
                    count += 1;
                }
                longest = Math.max(count, longest);
            }
            return longest;
        }

        public static boolean linearSearch(int[] nums, int search){
            for(int num: nums){
                if(num == search){
                    return true;
                }
            }
            return false;
        }
    */

    /*
        Better Solution
        TC -> O(NlogN){For Sorting} + O(N)
        SC -> O(N) {Sorting take temp array}
        public static int getLongestConsecutiveSequence(int[] nums){
            int longest = 1;
            Arrays.sort(nums);
            int lastSmallest = Integer.MIN_VALUE;
            int count = 1;
            for(int i=0;i<nums.length;i++){
                if(nums[i] -1 == lastSmallest){
                    count += 1;
                }else if(nums[i] != lastSmallest){
                    count = 1;
                }
                lastSmallest = nums[i];
                longest = Math.max(longest, count);
            }
            return longest;
        }
    */

    /*
        Optimal Solution
        TC -> O(N) + O(2N) -> O(3N)
        SC -> O(N)
    */
    public static int getLongestConsecutiveSequence(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int longest = 1;
        for(int num: set){
            if(!set.contains(num - 1)){
                int count = 1;
                while(set.contains(num + 1)){
                    count += 1;
                    num += 1;
                }
                longest = Math.max(count, longest);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        // Test Cases
        int[] nums1 = {100, 100, 100, 100, 99, 101, 101, 101, 101, 101};
        int[] nums2 = {100, 4, 200, 1, 3, 2};
        int[] nums3 = {102, 4, 100, 1, 101, 3, 2, 1, 1};

        System.out.println(getLongestConsecutiveSequence(nums1));
        System.out.println(getLongestConsecutiveSequence(nums2));
        System.out.println(getLongestConsecutiveSequence(nums3));
    }
}
