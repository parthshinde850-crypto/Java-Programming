import java.util.Scanner;

public class sum_of_first_n_natural_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first n natural no:");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <=n; i = i + 1) {
            sum = sum + i;
        }
        System.out.println(sum);
        sc.close();
    }
    
}
