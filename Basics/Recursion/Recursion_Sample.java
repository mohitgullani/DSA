public class Recursion_Sample{
    // Time Complexity -> O(N)
    // Space Complexity (Stack Space) -> O(N)
    public static void printName(String name, int n){
        if(n == 0){
            return;
        }
        System.out.println(name);
        printName(name, n - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        String name = "Mohit Gullani!";
        printName(name, n);
    }
}