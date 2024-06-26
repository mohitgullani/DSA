import java.util.*;

class Patterns{
    /* Pattern 1
                * * * * *
                * * * * *
                * * * * *
                * * * * *
                * * * * *
    */
    public static void printPattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /* Pattern 2
                *
                * *
                * * *
                * * * *
                * * * * *
    */
    public static void printPattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /* Pattern 3
                1 
                1 2
                1 2 3
                1 2 3 4
                1 2 3 4 5
     */
    public static void printPattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    /* Pattern 4
                1
                2 2
                3 3 3
                4 4 4 4
                5 5 5 5 5
     */
    public static void printPattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    /* Pattern 5
                * * * * * 
                * * * *
                * * *
                * *
                *
     */
    public static void printPattern5(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /* Pattern 6 
                1 2 3 4 5
                1 2 3 4
                1 2 3 
                1 2
                1
    */
    public static void printPattern6(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /* Pattern 7
                        *
                      * * *
                    * * * * *
                  * * * * * * *
                * * * * * * * * *
     */
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

    /*  Pattern 8
                * * * * * * * * *
                  * * * * * * *
                    * * * * * 
                      * * *
                        *
     */
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

    /* Pattern 9
                        *
                      * * *
                    * * * * *
                  * * * * * * *
                * * * * * * * * *
                * * * * * * * * *
                  * * * * * * * 
                    * * * * *
                      * * *
                        *
     */
    public static void printPattern9(int n){
        // Upper Part
        printPattern7(n);
        // Lower Part
        printPattern8(n);
    }

    /* Pattern 10
                *
                * *
                * * *
                * * * *
                * * * * *
                * * * *
                * * *
                * *
                *
     */
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

    /* Pattern 11
                1
                0 1
                1 0 1
                0 1 0 1
                1 0 1 0 1 
     */
    public static void printPattern11(int n){
        int start = 1;
        for(int i=0;i<n;i++){
            if(i % 2 == 0)  start = 1;
            else start = 0;
            for(int j=0;j<=i;j++){
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }

    /* Pattern 12
                1                 1
                1 2             2 1
                1 2 3         3 2 1
                1 2 3 4     4 3 2 1
                1 2 3 4 5 5 4 3 2 1
     */
    public static void printPattern12(int n){
        for(int i=1;i<=n;i++){
            // Numbers
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            // Spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            // Numbers
            for(int j=i;j>=1;j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /* Pattern 13
                1
                2 3
                4 5 6
                7 8 9 10
                11 12 13 14 15
     */
    public static void printPattern13(int n){
        int count = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }

    /* Pattern 14
                A
                A B
                A B C
                A B C D
                A B C D E
     */
    public static void printPattern14(int n){
        for(int i=0;i<n;i++){
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    /* Pattern 15
                A B C D E
                A B C D
                A B C
                A B
                A
     */
    public static void printPattern15(int n){
        for(int i=n-1;i>=0;i--){
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    /* Pattern 16
                A
                B B
                C C C
                D D D D
                E E E E E
     */
    public static void printPattern16(int n){
        for(int i=0;i<n;i++){
            char ch = (char)('A' + i);
            for(int j=0;j<=i;j++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    /* Pattern 17
                        A
                      A B A
                    A B C B A
                  A B C D C B A 
                A B C D E D C B A
     */
    public static void printPattern17(int n){
        for(int i=0;i<n;i++){
            // Spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print("  ");
            }
            char ch = 'A';
            int breakPoint = (2*i+1)/2;
            for(int j=0;j<2*i+1;j++){
                System.out.print(ch + " ");
                if(j < breakPoint)  ch++;
                else    ch--;
            }
            System.out.println();
        }
    }

    /* Pattern 18
                E
                D E
                C D E
                B C D E
                A B C D E
     */
    public static void printPattern18(int n){
        for(int i=0;i<n;i++){
            char ch = (char)('E' - i);
            for(int j=0;j<=i;j++){
                System.out.print((char)(ch + j) + " ");
            }
            System.out.println();
        }
    }

    /* Pattern 19
                **********
                ****  ****
                ***    ***
                **      **
                *        *
                *        *
                **      **
                ***    ***
                ****  ****
                **********
     */
    public static void printPattern19(int n){
        // Upper Part
        for(int i=0;i<n;i++){
            // Stars
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            // Spaces
            for(int j=0;j<2*i;j++){
                System.out.print(" ");
            }
            // Stars
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower Part
        for(int i=n-1;i>=0;i--){
            // Stars
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            // Spaces
            for(int j=0;j<2*i;j++){
                System.out.print(" ");
            }
            // Stars
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /* Pattern 20
                *                 *
                * *             * *
                * * *         * * *
                * * * *     * * * *
                * * * * * * * * * *
                * * * *     * * * * 
                * * *         * * *
                * *             * *
                *                 *
     */
    public static void printPattern20(int n){
        for(int i=0;i<n;i++){
            // Stars
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            // Spaces
            for(int j=0;j<2*(n-i-1);j++){
                System.out.print("  ");
            }
            // Stars
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n-2;i>=0;i--){
            // Stars
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            // Spaces
            for(int j=0;j<2*(n-i-1);j++){
                System.out.print("  ");
            }
            // Stars
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /* Pattern 21
                * * * * *
                *       *
                *       *
                *       *
                * * * * *
     */
    public static void printPattern21(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i == 0 || j == 0 || i == n-1 || j == n-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
    /* Pattern 22
                5 5 5 5 5 5 5 5 5
                5 4 4 4 4 4 4 4 5
                5 4 3 3 3 3 3 4 5
                5 4 3 2 2 2 3 4 5
                5 4 3 2 1 2 3 4 5
                5 4 3 2 2 2 3 4 5
                5 4 3 3 3 3 3 4 5
                5 4 4 4 4 4 4 4 5
                5 5 5 5 5 5 5 5 5
     */
    public static void printPattern22(int n){
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top = i;
                int left = j;
                int right = (2*n - 2) - j;
                int bottom = (2*n - 2) - i;
                System.out.print(n - Math.min(Math.min(top, left), Math.min(right, bottom)) + " ");
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
        System.out.println("---------- Pattern 11 ----------");
        printPattern11(n);
        System.out.println("---------- Pattern 12 ----------");
        printPattern12(n);
        System.out.println("---------- Pattern 13 ----------");
        printPattern13(n);
        System.out.println("---------- Pattern 14 ----------");
        printPattern14(n);
        System.out.println("---------- Pattern 15 ----------");
        printPattern15(n);
        System.out.println("---------- Pattern 16 ----------");
        printPattern16(n);
        System.out.println("---------- Pattern 17 ----------");
        printPattern17(n);
        System.out.println("---------- Pattern 18 ----------");
        printPattern18(n);
        System.out.println("---------- Pattern 19 ----------");
        printPattern19(n);
        System.out.println("---------- Pattern 20 ----------");
        printPattern20(n);
        System.out.println("---------- Pattern 21 ----------");
        printPattern21(n);
        System.out.println("---------- Pattern 22 ----------");
        printPattern22(n);
    }
}