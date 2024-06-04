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

    public static void printPattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void printPattern5(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printPattern6(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void printPattern7(int n){
        for(int i=0;i<n;i++){
            // Spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print("  ");
            }
            // Stars
            for(int j=0;j<2*i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printPattern8(int n){
        for(int i=0;i<n;i++){
            // Spaces
            for(int j=0;j<i;j++){
                System.out.print("  ");
            }
            // Stars
            for(int j=0;j<2*(n-i) - 1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printPattern9(int n){
        // Upper Part
        printPattern7(n);
        // Lower Part
        printPattern8(n);
    }

    public static void printPattern10(int n){
        // Upper Part
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // Lower Part
        for(int i=n-1;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("* ");
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
        System.out.println("---------- Pattern 4 ----------");
        printPattern4(n);
        System.out.println("---------- Pattern 5 ----------");
        printPattern5(n);
        System.out.println("---------- Pattern 6 ----------");
        printPattern6(n);
        System.out.println("---------- Pattern 7 ----------");
        printPattern7(n);
        System.out.println("---------- Pattern 8 ----------");
        printPattern8(n);
        System.out.println("---------- Pattern 9 ----------");
        printPattern9(n);
        System.out.println("---------- Pattern 10 ----------");
        printPattern10(n);
    }
}