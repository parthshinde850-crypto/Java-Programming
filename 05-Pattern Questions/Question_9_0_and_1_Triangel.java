// Question 9 = print the pattern
// 1 
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

public class Question_9_0_and_1_Triangel {
    public static void main(String[] args) {
        
        int n = 5;

        // OUTER LOOP
        for (int i = 1; i <= n; i++) {
            // INNER LOOOP
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0 ) { // EVEN
                    System.out.print("1 ");
                } else {  // ODD
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    
}
