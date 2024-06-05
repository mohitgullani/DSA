public class Prime_Number {
    // TC -> O(N) & SC -> O(1)
    public static boolean primeNumberApproach1(int n){
        int count = 0;
        for(int i=1;i<=n;i++){
            if(n % i == 0){
                count++;
            }
        }
        return (count == 2) ? true : false;
    }

    // TC -> O(Sqrt(N)) and SC -> O(1)
    public static boolean primeNumberApproach2(int n){
        int count = 0;
        for(int i=1;i*i<=n;i++){
            if(n % i == 0){
                count++;
                if((n / i) != i){
                    count++;
                }
            }
        }
        return (count == 2) ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(primeNumberApproach1(6));
        System.out.println(primeNumberApproach2(17));
    }
}
