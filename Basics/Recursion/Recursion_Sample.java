public class Recursion_Sample{
    static int count = 0;
    public static void f(){
        if(count == 5){
            return;
        }
        System.out.println("Hello Mohit!");
        count++;
        f();
    }
    public static void main(String[] args) {
        f();
    }
}