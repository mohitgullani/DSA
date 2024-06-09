// Similar Problem on Leetcode: https://leetcode.com/problems/rotate-array/

public class Rotate_Array_By_1_Place {
    /*
        Left rotating the array by 1 place
        TC -> O(N)
        SC -> O(1)
        There is not Brute, Better, Optimal solution for this
    */
    public static void rotateArray(int[] arr){
        int temp = arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }

    public static void main(String[] args) {
        // Test Cases
        int[] nums1 = {1,2,3,4,5,6,7};
        int[] nums2 = {-1,-100,3,99};

        rotateArray(nums1);
        display(nums1);

        rotateArray(nums2);
        display(nums2);
    }

    public static void display(int[] arr){
        for(int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
