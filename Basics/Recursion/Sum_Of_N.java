public class Sum_Of_N {
    // Time Complexity -> O(N)
    // Space Complexity -> O(N) -> Stack Space
    public static int sumOfN(int n){
        if(n == 0){
            return 0;
        }
        return n + sumOfN(n - 1);
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println("Sum of first " + n +" numbers is " + sumOfN(n));
    }
}
