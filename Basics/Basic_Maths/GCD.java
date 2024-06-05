public class GCD {
    // Time Complexity -> o(min(a, b)) & SC -> O(1)
    public static int gcdApproach1(int a, int b){
        int min = Math.min(a, b);
        for(int i = min;i>=1;i--){
            if(a % i == 0 && b % i == 0){
                return i;
            }
        }
        return 1;
    }

    // Euclidean Algorithm
    // TC -> O(logphi(min(a, b))) & SC -> O(1)
    public static int gcdApproach2(int a, int b){
        while(a > 0 && b > 0){
            if(a > b){
                a = a % b;
            }else{
                b = b % a;
            }
        }
        if(a == 0)  return b;
        else    return a;
    }
    public static void main(String[] args) {
        System.out.println("GCD using approach 1: " + gcdApproach1(15, 10));
        System.out.println("GCD using approach 2: " + gcdApproach2(15, 10));
    }
}
