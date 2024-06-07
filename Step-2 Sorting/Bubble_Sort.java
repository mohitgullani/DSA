import java.util.*;

public class Bubble_Sort {
    // Swapping if smaller
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] =arr[j];
        arr[j] = temp;
    }

    // Bubble Sort Algorithm
    // TC -> nearly O(N^2) in Average and Worst case but in Best Case, TC would be O(N).
    // SC -> O(1)
    public static void bubbleSort(int[] arr, int n){
        for(int i=n-1;i>=1;i--){
            boolean swapped = false;
            for(int j=0;j<=i-1;j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                    swapped = true;
                }
            }
            if(swapped == false){
                break;
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
        bubbleSort(arr, n);
        display(arr);
    }
}
