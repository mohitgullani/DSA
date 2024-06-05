public class Palindrome {
    // Time Complexity is O(log10(n)) and SC is O(1)
    public static boolean isPalindrome(int x) {
        int reverse = 0;
        int temp = x;
        while(temp > 0){
            int digit = temp % 10;
            reverse = (reverse * 10) + digit;
            temp /= 10;
        }

        return (x == reverse) ? true : false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(452));
        System.out.println(isPalindrome(74547));
    }
}
