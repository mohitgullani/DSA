class Count_Digit{

    // Time Complexity is O(log10(n))
    public static int countDigit1(int n){
        int count = 0;
        while(n > 0){
            int d = n%10;
            count++;
            n /= 10;
        }
        return count;
    }

    // Used inbuilt log10 function to find digits
    public static int countDigit2(int n){
        return (int)Math.log10(n) + 1;
    }
    public static void main(String[] args) {
        int n = 52896;
        System.out.println("Digits in the given number " + n + " is " + countDigit1(n));
        System.out.println("Digits in the given number " + n + " is " + countDigit2(n));
    }
}