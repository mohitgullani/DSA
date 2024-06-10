public class Max_Consecutive_Ones {
    /*
        This is very straight forward question, so no need to think of brute, better or optimal solution
        TC -> O(N)
        SC -> O(1)
    */
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0, count = 0;
        for(int num: nums){
            if(num == 1){
                count++;
                maxOnes = Math.max(maxOnes, count);
            }else{
                count=0;
            }
        }
        return maxOnes;
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 0, 1, 1, 1};
        int[] nums2 = {1, 0, 1, 1, 0, 1};
        System.out.println(findMaxConsecutiveOnes(nums1));
        System.out.println(findMaxConsecutiveOnes(nums2));
    }
}
