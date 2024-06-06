import java.util.*;

public class Count_Frequency {
    // TC -> O(2N) -> O(N)
    // SC -> O(N)
    public static void countAndDisplay(int[] arr, int n){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int key: map.keySet()){
            System.out.println(key + " -> " + map.get(key));
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter " + (i + 1) + " number: ");
            arr[i] = sc.nextInt();
        }
        countAndDisplay(arr, n);
    }    
}
