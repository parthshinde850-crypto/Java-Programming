// Question 7 = print the pattern
//  1 2 3 4 5 
//  1 2 3 4
//  1 2 3
//  1 2
//  1 


public class Question_7_Inverted_Half_Pyramid_with_numbers {

    public static void main(String[] args) {
        
        int n = 5;
         
        for (int i = n;  i >= 1; i = i - 1) {
            for (int j = 1; j <= i; j = j + 1){
                System.out.print(j+ " ");
            }
            System.out.println();

        }
    }
    
}


// ANOTHER WAY 

        // OUTER LOOP
        // for (int i = 1; i<= n; i++) {
        //     // INNER LOOP
        //     for (int j = 1; j<=n-i+1; j++) {
        //         System.out.println(j+ ' ');
        //     }
        //     System.out.println();
        // }
