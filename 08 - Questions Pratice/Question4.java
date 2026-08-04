// Write a function that takes in the radius as input and returns the circumference of a circle.
import java.util.Scanner;

public class Question4 {

    public static double circumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double ans = circumference(radius);

        System.out.println("Circumference = " + ans);

        sc.close();
    }
}