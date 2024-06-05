public class Factorial {
    // Time Complexity -> O(N)
    // Space Complexity -> O(N) -> Stack Space
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        return n * fact(n - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of " + n +" is " + fact(n));
    }
}
