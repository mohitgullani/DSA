import java.util.*;

public class All_Divisors {
    // Time Complexity -> O(N) and SC -> O(1)
    // Space Complexity is O(1) because I am using list to store the divisors, I'm not using to solve the problem
    public static List<Integer> divisors(int n){
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n % i == 0){
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        List<Integer> list = divisors(36);
        System.out.println(list);
    }
}
