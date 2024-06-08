// Problem Link: https://www.geeksforgeeks.org/problems/second-largest3735/1
import java.util.*;

public class Second_Largest {
    /*
        Brute Force
        TC -> O(NlogN) + O(N)
        SC -> Depends on the sorting algorithm if we are using merge sort, then the SC would be O(N), if we are using quick sort, then it would be O(1)
        public static int getSecondLargest(int[] arr, int n){
            Arrays.sort(arr);
            int largest = arr[n - 1];
            for(int i = n-2;i>=0;i--){
                if(arr[i] != largest){
                    return arr[i];
                }
            }
            return Integer.MIN_VALUE;
        }
    */

    /*
        Better Approach
        TC -> O(N) + O(N)
        SC -> O(1)
        public static int getSecondLargest(int[] arr, int n){
            int largest = Integer.MIN_VALUE;
            for(int num: arr){
                if(num > largest){
                    largest = num;
                }
            }
            int secondLargest = Integer.MIN_VALUE;
            for(int num: arr){
                if(num != largest && num > secondLargest){
                    secondLargest = num;
                }
            }
            return secondLargest;
        }
    */

    /* 
        Optimal Solution
        TC -> O(N)
        SC -> O(1)
    */
    public static int getSecondLargest(int[] arr, int n){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i] > largest){
                secondLargest  = largest;
                largest = arr[i];
            }else if(arr[i] < largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int secondLargest = getSecondLargest(arr, n);
        if(secondLargest != Integer.MIN_VALUE){
            System.out.println("Second Largest Element: " + secondLargest);
        }else{
            System.out.println("No second largest element exists!");
        }
    }
}
