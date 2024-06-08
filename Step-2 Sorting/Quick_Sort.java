import java.util.Scanner;

public class Quick_Sort {
    public static void display(int[] arr){
        for(int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low, j = high;
        while(i < j){
            while(i <= high && arr[i] <= pivot){
                i++;
            }
            while(j >= low && arr[j] > pivot){
                j--;
            }
            if(i < j){
                swap(arr, i, j);
            }
        }
        swap(arr, low, j);
        return j;
    }
    
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Quick Sort Algorithm
    // TC -> nearly O(NlogN) in Best, Average and Worst case
    // SC -> O(1) we are just using stack space due to recursion
    public static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int partition = partition(arr, low, high);
            quickSort(arr, low, partition - 1);
            quickSort(arr, partition + 1, high);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements to be sorted: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, n - 1);
        display(arr);
    }
}
