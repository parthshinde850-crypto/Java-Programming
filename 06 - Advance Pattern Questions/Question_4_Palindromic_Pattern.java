// Question 4 : print the pattern 

//         1
//       2 1 2  
//     3 2 1 2 3
//   4 3 2 1 2 3 4 
// 5 4 3 2 1 2 3 4 5


public class Question_4_Palindromic_Pattern {
    public static void main(String[] args) {
        
        int n = 5;

        for (int i = 1; i <= n; i++) {

            // SPACES
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            // FIRST HALF
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // SECOND HALF
            for (int j = 2; j <= i; j++) {  // Here int j = 1 take then 11 print starting line which is still palindromic pattern
                System.out.print(j);
            }
            System.out.println();


        }
    }
}
