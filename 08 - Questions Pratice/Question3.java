// Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.Scanner;

public class Question3 {

    public static int greaterOfTwoNo(int a , int b) {
        if (a > b) {
            return a;
          
        } else {
            return b;
            
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no:");
        int a = sc.nextInt();
        System.out.print("Enter second no:");
        int b = sc.nextInt();

        int greater = greaterOfTwoNo(a, b);
        System.out.println("Greater no is :"+ greater);
        sc.close();

    }
    
}
