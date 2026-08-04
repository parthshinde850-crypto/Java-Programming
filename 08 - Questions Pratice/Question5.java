// Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age › 18 is eligible to vote.

import java.util.Scanner;

public class Question5 {

    public static boolean isEligible (int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age :");
        int age = sc.nextInt();

        if (isEligible(age)) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not Eliglible to vote");
        }

        
        sc.close();


    }
    
}
