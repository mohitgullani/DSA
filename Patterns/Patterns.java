import java.util.*;

class Patterns{
    public static void printPattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printPattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printPattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("---------- Pattern 1 ----------");
        printPattern1(n);
        System.out.println("---------- Pattern 2 ----------");
        printPattern2(n);
        System.out.println("---------- Pattern 3 ----------");
        printPattern3(n);
    }
}