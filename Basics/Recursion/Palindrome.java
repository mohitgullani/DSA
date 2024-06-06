public class Palindrome {
    // TC -> O(N/2) -> O(N)
    // SC -> O(N/2) -> O(N)
    // The Space Complexity is the Stack Space due to recursion calls
    public static boolean isPalindrome(int index, int n, String s){
        if(index >= n/2){
            return true;
        }
        if(s.charAt(index) != s.charAt(n - index - 1)){
            return false;
        }
        return isPalindrome(index + 1, n, s);
    }
    public static void main(String[] args) {
        String str1 = "MADAM";
        System.out.println(str1 + " is palindrome: " + isPalindrome(0, str1.length(), str1));
        String str2 = "MADSM";
        System.out.println(str2 + " is palindrome: " + isPalindrome(0, str2.length(), str2));
    }
}
