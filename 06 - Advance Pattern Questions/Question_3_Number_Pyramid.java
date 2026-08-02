// Question 3 : print the pattern 

//        1
//       2 2
//      3 3 3
//     4 4 4 4
//    5 5 5 5 5 

public class Question_3_Number_Pyramid {
    public static void main(String[] args) {
        
        int n = 5;
        
        for (int i = 1; i <= n; i++) {

            // SPACES
            for (int j =1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // NUMBERS => print row no , row no times
            for (int j = 1; j<=i; j++) {
                System.out.print(i + " ");  // +" " not use, then not get pyramid shape 
            }
            System.out.println();
        }
    }
    
}
