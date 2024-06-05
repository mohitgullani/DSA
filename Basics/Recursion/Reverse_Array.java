public class Reverse_Array {
    public static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    
    public static void display(int[] arr){
        for(int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // TC -> O(N/2) -> O(N)
    // SC -> O(N/2) -> O(N)
    public static void reverseArrayUsingTwoPointer(int[] arr, int left, int right){
        if(left >= right){
            return;
        }
        swap(arr, left, right);
        reverseArrayUsingTwoPointer(arr, left + 1, right - 1);
    }

    // TC -> O(N/2) -> O(N)
    // SC -> O(N/2) -> O(N)
    public static void reverseArrayUsingSinglePointer(int index, int[] arr){
        if(index >= arr.length/2){
            return;
        }
        swap(arr, index, arr.length - index - 1);
        reverseArrayUsingSinglePointer(index + 1, arr);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        System.out.print("Array after reversing using 2 pointer in recursion: ");
        reverseArrayUsingTwoPointer(arr, 0, n - 1);
        display(arr);


        int[] arr1 = {4, 5, 6, 7, 8, 9};
        int n1 = arr1.length;
        System.out.print("Array after reversing using single pointer in recursion: ");
        reverseArrayUsingTwoPointer(arr1, 0, n1 - 1);
        display(arr1);
    }
}
