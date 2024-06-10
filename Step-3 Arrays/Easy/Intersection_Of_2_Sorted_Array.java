import java.util.ArrayList;

public class Intersection_Of_2_Sorted_Array {
    /*
        Brute Force
        TC -> O(N1 * N2)
        SC -> O(N2)
        public static ArrayList<Integer> getIntersection(int[] arr1, int[] arr2){
            ArrayList<Integer> list = new ArrayList<>();
            int n1=arr1.length, n2=arr2.length;
            boolean[] visited = new boolean[n2];
            for(int i=0;i<n1;i++){
                for(int j=0;j<n2;j++){
                    if(arr1[i] == arr2[j] && !visited[j]){
                        list.add(arr1[i]);
                        visited[j] = true;
                        break;
                    }
                    if(arr2[j] > arr1[i]){
                        break;
                    }
                }
            }
            return list;
        }
    */

    /*
        Optimal Solution
        TC -> O(N1 + ON2)
        SC -> O(1)
    */
    public static ArrayList<Integer> getIntersection(int[] arr1, int[] arr2){
        ArrayList<Integer> list = new ArrayList<>();
        int n1=arr1.length, n2=arr2.length;
        int i=0, j=0;
        while(i < n1 && j < n2){
            if(arr1[i] < arr2[j]){
                i++;
            }else if(arr1[i] > arr2[j]){
                j++;
            }else{
                list.add(arr1[i]);
                i++;
                j++;
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 6, 7};
        ArrayList<Integer> list = getIntersection(arr1, arr2);
        System.out.println(list);
    }
}
