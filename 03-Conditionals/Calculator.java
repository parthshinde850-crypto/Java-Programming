import java.util.Scanner;

public class calculator {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int operation = sc.nextInt(); 

        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
    
        
        switch (operation) { 
            case 1: System.out.println(a + b);
            break;
            case 2: System.out.println(a - b);
            break;
            case 3: System.out.println(a * b);
            break;
            case 4: System.out.println(a / b);
            break;
            default:System.out.println("INVALID PLEASE ENTER 1 TO 4 NO");
            
        
           sc.close();
        }

    }

    
}
