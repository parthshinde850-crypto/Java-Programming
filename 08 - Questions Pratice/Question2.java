// Write a function to print the sum of all odd numbers from 1 to n.

import java.util.Scanner;

public class Question2 {

    public static void sumOfOdd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++){
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("Sum of odd no:"+ sum);
    }
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no :");
        int n = sc.nextInt();

        sumOfOdd(n);
        sc.close();
    }
}
