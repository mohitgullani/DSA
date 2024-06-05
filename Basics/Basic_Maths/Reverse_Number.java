public class Reverse_Number {
    // Time Complexity is O(log10(n)) and Space Complexity is O(1)
    public static int reverse(int n){
        int reverse = 0;
        while(n > 0){
            int digit = n % 10;
            reverse = (reverse * 10) + digit;
            n /= 10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        int n = 745896;
        System.out.println("Reversed Number is " + reverse(n));
    }
}
