import java.util.*;

public class Majority_Element_II {
    /*
        Brute Force
        TC -> O(N^2)
        SC -> O(2) -> O(1)
        public static List<Integer> majorityElement(int[] nums) {
            List<Integer> list = new ArrayList<>();
            int n = nums.length;
            for(int i=0;i<n;i++){
                if(list.size() == 0 || list.get(0) != nums[i]){
                    int count = 0;
                    for(int j=0;j<n;j++){
                        if(nums[i] == nums[j]){
                            count++;
                        }
                    }
                    if(count > n/3){
                        list.add(nums[i]);
                    }
                }
                if(list.size() == 2){
                    break;
                }
            }
            return list;
        }
    */

    /*
        Better Solution
        TC -> O(N)
        SC -> O(N)
        public static List<Integer> majorityElement(int[] nums) {
            List<Integer> list = new ArrayList<>();
            HashMap<Integer, Integer> map = new HashMap<>();
            int n = nums.length;
            for(int num: nums){
                map.put(num, map.getOrDefault(num, 0) + 1);
                if(map.get(num) > n/3 && (list.size() == 0 || list.get(0) != num)){
                    list.add(num);
                    if(list.size() == 2)    break;
                }
            }
            return list;
        }
    */

    // Optimal Solution
    // TC -> O(2N)
    // SC -> O(1)
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        int count1 = 0, element1 = -1, count2 = 0, element2 = -1;
        for(int num: nums){
            if(count1 == 0 && num != element2){
                count1 = 1;
                element1 = num;
            }else if(count2 == 0 && num != element1){
                count2 = 1;
                element2 = num;
            }else if(element1 == num){
                count1++;
            }else if(element2 == num){
                count2++;
            }else{
                count1--;
                count2--;
            }
        }
        
        if(element1 == element2){
            list.add(element1);
            return list;
        }

        int cnt1 = 0, cnt2 = 0;
        for(int num: nums){
            if(num == element1) cnt1++;
            if(num == element2) cnt2++;
        }
        if(cnt1 > n/3)  list.add(element1);
        if(cnt2 > n/3)  list.add(element2);
        return list;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 2, 3};
        int[] nums2 = {1, 1, 1, 3, 3, 2, 2, 2};
        int[] nums3 = {1, 2};
        int[] nums4 = {1};

        System.out.println(majorityElement(nums1));
        System.out.println(majorityElement(nums2));
        System.out.println(majorityElement(nums3));
        System.out.println(majorityElement(nums4));
    }
}
