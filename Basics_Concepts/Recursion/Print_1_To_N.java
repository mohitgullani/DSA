public class Print_1_To_N {
    // TC -> O(N)
    // SC -> O(N)
    public static void print(int n){
        if(n == 0){
            return;
        }
        print(n - 1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }    
}
