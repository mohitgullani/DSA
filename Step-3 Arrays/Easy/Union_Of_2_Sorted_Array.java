/*
    Problem Link: https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1
    Problem Name: Union of Two Sorted Arrays
*/

import java.util.*;

public class Union_Of_2_Sorted_Array {
    /*
        Brute Force Approach
        TC -> O(N1logN) + O(N2logN) + O(N1 + N2)
        SC -> O(N1 + N2) for the set. I am not counting the list into my space complexity as I am not using it to solve the problem, I am just using it to return the answer!
        public static ArrayList<Integer> getUnion(int[] arr1, int[] arr2){
            Set<Integer> set = new HashSet<>();
            for(int num: arr1){
                set.add(num);
            }
            for(int num: arr2){
                set.add(num);
            }
            ArrayList<Integer> list = new ArrayList<>();
            for(int num: set){
                list.add(num);
            }
            return list;
        }
    */

    /*
        Optimal Solution
        TC -> (n1 + n2)
        SC -> O(1), I am not counting the list into my space complexity as I am not using it to solve the problem, I am just using it to return the answer!
    */
    public static ArrayList<Integer> getUnion(int[] arr1, int[] arr2){
        ArrayList<Integer> list = new ArrayList<>();
        int n1 = arr1.length, n2 = arr2.length;
        int i=0, j=0;
        while(i < n1 && j < n2){
            if(arr1[i] <= arr2[j]){
                if(list.size() == 0 || list.get(list.size() - 1) != arr1[i]){
                    list.add(arr1[i]);
                }
                i++;
            }else{
                if(list.size() == 0 || list.get(list.size() - 1) != arr2[j]){
                    list.add(arr2[j]);
                }
                j++;
            }
        }
        while(i < n1){
            if(list.size() == 0 || list.get(list.size() - 1) != arr1[i]){
                list.add(arr1[i]);
            }
            i++;
        }
        while(j < n2){
            if(list.size() == 0 || list.get(list.size() - 1) != arr2[j]){
                list.add(arr2[j]);
            }
            j++;
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 6, 7};
        ArrayList<Integer> list = getUnion(arr1, arr2);
        System.out.println(list);
    }
}
