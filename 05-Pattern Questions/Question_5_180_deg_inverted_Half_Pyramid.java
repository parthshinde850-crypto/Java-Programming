// Question 5 = print the pattern
//        * 
//      * * 
//    * * * 
//  * * * *


public class Question_5_180_deg_inverted_Half_Pyramid{
    public static void main(String[] args) {
        
        int n = 4;
         
        // Outer loop for rows
        for (int i = 1; i <= n; i = i +1) {

            // Innerm loop 1st for spaces print
            for (int j = 1; j <= n-i; j = j + 1) {
                System.out.print(" ");
            }

            // Inner loop 2nd for star but out side 1st inner loop because there is memeory saved for j outside no memeory for j now
            for (int j = 1; j <= i; j = j + 1 ) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}