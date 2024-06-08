import java.util.*;

public class Merge_Sort {
    // Swapping if smaller
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] =arr[j];
        arr[j] = temp;
    }

    // Merge Sort Algorithm
    // TC -> nearly O(NlogN) in Best, Average and Worst case
    // SC -> O(N)
    public static void mergeSort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }
        int mid = (low + high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void merge(int[] arr, int low, int mid, int high){
        int[] temp = new int[high - low + 1];
        int left = low, right = mid + 1, k = 0;
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp[k++] = arr[left++];
            }else{
                temp[k++] = arr[right++];
            }
        }

        while(left <= mid){
            temp[k++] = arr[left++];
        }
        while(right <= high){
            temp[k++] = arr[right++];
        }

        for(int i=low;i<=high;i++){
            arr[i] = temp[i - low];
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
        mergeSort(arr, 0, n - 1);
        display(arr);
    }
}
