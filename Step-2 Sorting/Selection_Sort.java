import java.util.*;

public class Selection_Sort {
    // Swapping if smaller
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] =arr[j];
        arr[j] = temp;
    }

    // Selection Sort Algorithm
    // TC -> nearly O(N^2) in Best, Average and Worst case
    // SC -> O(1)
    public static void selectionSort(int[] arr, int n){
        for(int i=0;i<=n-2;i++){
            int min = i;
            for(int j=i;j<=n-1;j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            swap(arr, min, i);
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
        selectionSort(arr, n);
        display(arr);
    }
}
