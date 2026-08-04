// Enter 3 numbers from the user & make a function to print their average.

import java.util.Scanner;

public class Question1 {
        public static void average(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        System.out.println("Average:"+ avg);
        }
        public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first no:");
        int a = sc.nextInt();
        System.out.print("Enter second no:");
        int b = sc.nextInt();
        System.out.print("Enter third no:");
        int c = sc.nextInt();

        average(a, b, c);

    

      

        sc.close();
        
    }
    
}
