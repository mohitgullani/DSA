import java.util.*;

public class All_Divisors {
    // Time Complexity -> O(N)
    // Space Complexity is O(1) because I am using List to store the divisors, I'm not using to solve the problem
    public static List<Integer> divisorsApproach1(int n){
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n % i == 0){
                list.add(i);
            }
        }
        return list;
    }

    // Time Complexity -> O(Sqrt(N))
    // Space Complexity is O(1) because I am using List to store the divisors, I'm not using to solve the problem
    public static List<Integer> divisorsApproach2(int n){
        /* For N = 36
            1 * 36
            2 * 18
            3 * 12
            4 * 9
            6 * 6
            9 * 4
            12 * 3
            18 * 2
            36 * 1
         */
        List<Integer> list = new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n % i == 0){
                list.add(i);

                if((n/i) != i){ 
                    list.add(n/i);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list1 = divisorsApproach1(36);
        System.out.println(list1);
        List<Integer> list2 = divisorsApproach2(36);
        Collections.sort(list2);
        System.out.println(list2);
    }
}
