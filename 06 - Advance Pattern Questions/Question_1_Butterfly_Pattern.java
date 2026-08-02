// Question 1 : print the pattern 

// *             *
// * *         * *
// * * *     * * *
// * * * * * * * *
// * * * * * * * *
// * * *     * * *
// * *         * *
// *             *
// Given n = 4








public class Question_1_Butterfly_Pattern {
    public static void main(String[] args) {
        
        int n = 4;

        // UPPER HALF
        for (int i = 1; i <= n; i++) {

            // FIRST HALF (RIGHT SIDE)
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }

            // SPACES
            int spaces = 2 * (n-i);
            for (int j = 1; j<=spaces; j++) {
                System.out.print(" ");
            }

            //SECOND PART (LEFT SIDE)
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

      
        // LOWER HALF
        for (int i = n; i >= 1; i--) {

            // FIRST HALF (RIGHT SIDE)
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }

            // SPACES
            int spaces = 2 * (n-i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            //SECOND PART (LEFT SIDE)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }


        
    }
    
}
