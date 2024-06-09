// Problem Link: https://leetcode.com/problems/rotate-array/

public class Rotate_Array_By_D_Places {

    /*
        Brute Force Solution
        TC -> O(d) + O(n-d) + O(d) => O(n + d)
        SC -> O(d)
    
        public static void rotateArrayByD(int[] arr, int d){
            int[] temp = new int[d];
            int n = arr.length;
            d %= arr.length;
            for(int i=0;i<d;i++){
                temp[i] = arr[(n-d) + i];
            }
            for(int i=n-d-1;i>=0;i--){
                arr[i+d] = arr[i];
            }
            for(int i=0;i<d;i++){
                arr[i] = temp[i];
            }
        }
    */

    /*
        Optimal Solution
        TC -> O(n-d) + O(d) + O(n) => P(2n)
        SC -> O(1)
    */
    public static void rotateArrayByD(int[] arr, int d){
        int n = arr.length;
        d %= arr.length;
        reverse(arr, 0, n-d-1);
        reverse(arr, n-d, n-1);
        reverse(arr, 0, n-1);
    }

    public static void reverse(int[] arr, int i, int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        // Test Cases
        int[] nums1 = {1,2,3,4,5,6,7};
        int[] nums2 = {-1,-100,3,99};
        int d1=3, d2=2;
        rotateArrayByD(nums1, d1);
        display(nums1);

        rotateArrayByD(nums2, d2);
        display(nums2);
    }    

    public static void display(int[] arr){
        for(int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
