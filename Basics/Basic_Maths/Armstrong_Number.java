public class Armstrong_Number {
    // Time Complexity is O(log10(n)) and SC is O(1)
    public static boolean isArmstrong(int n){
        int sum = 0;
        int temp = n;
        while(temp > 0){
            int digit = temp % 10;
            sum += Math.pow(digit, 3);
            temp /= 10;
        }
        return (sum == n) ? true : false;
    }
    public static void main(String[] args) {
        System.out.println(isArmstrong(371));
        System.out.println(isArmstrong(1634));
        System.out.println(isArmstrong(35));
    }
}
