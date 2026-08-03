import java.util.Scanner;

public class Factorial_of_number {

    public static void printFactorial(int n) {
        // LOOP
        if (n < 0) {
            System.out.println("Invalid No , Enter positive No");
            return;
        }
        int factorial = 1;   // 0! is also 1 therefore 
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;    // no use of return also possible because void function use
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to get factorial;");
        int n = sc.nextInt();

        System.out.print("Factorial:");
        printFactorial(n);
        sc.close();

        
    }
    
}
