import java.util.*;

public class Insertion_Sort {
    // Swapping if smaller
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] =arr[j];
        arr[j] = temp;
    }

    // Insertion Sort Algorithm
    // TC -> nearly O(N^2) in Average and Worst case but in Best Case, TC would be O(N)
    // SC -> O(1)
    public static void insertionSort(int[] arr, int n){
        for(int i=0;i<n;i++){
            int j = i;
            while(j > 0 && arr[j - 1] > arr[j]){
                swap(arr, j - 1, j);
                j--;
            }
        }
    }

    public static void display(int[] arr){
        for(int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements to be sorted: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        insertionSort(arr, n);
        display(arr);
    }
}
