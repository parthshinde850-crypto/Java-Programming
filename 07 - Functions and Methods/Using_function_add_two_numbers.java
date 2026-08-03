// Question = Make a function to add 2 numbers and return the sum

import java.util.Scanner;

public class Using_function_add_two_numbers {

    public static int  calculateSum (int a, int b){
        int sum = a + b;
        return sum;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no:");
        int a = sc.nextInt();
        System.out.print("Enter Second no:");
        int b = sc.nextInt();
      
        System.out.print("Result:");
       

        int sum = calculateSum(a, b);
        System.out.println(sum);
        sc.close();
    }
    
}
