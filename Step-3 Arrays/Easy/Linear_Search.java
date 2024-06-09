// Linear Search 
// Problem Link: https://www.geeksforgeeks.org/problems/who-will-win-1587115621/1


public class Linear_Search {
    /*
        TC -> O(N)
        SC -> O(1)
    */
    public static boolean linearSearch(int[] nums, int k){
        for(int num: nums){
            if(num == k){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,6};
        int[] nums2 = {1,3,4,5,6};
        int k1 = 6, k2 = 2;
        System.out.println(linearSearch(nums1, k1));
        System.out.println(linearSearch(nums2, k2));
    }
}
