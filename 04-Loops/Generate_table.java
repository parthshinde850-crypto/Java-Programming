import java.util.Scanner;

public class Generate_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no to generate table: ");
        int n = sc.nextInt();

        for (int i = 1; i < 11; i = i + 1){
            System.out.println(n*i);
            sc.close();
        }

    }
    
}
