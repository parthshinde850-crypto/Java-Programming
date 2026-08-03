import java.util.*;

public class Using_function_Product_of_two_no{
    public static int multiply(int a , int b) {
        return a * b;
    
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first no:");
        int a = sc.nextInt();
        
        System.out.print("Enter second  no:");
        int b = sc.nextInt();

        System.out.print("Result:");

   
        System.out.println(multiply(a, b));
        sc.close();


    }
}