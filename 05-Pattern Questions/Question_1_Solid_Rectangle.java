// Question 1 = print the pattern
//   * * * * * 
//   * * * * *
//   * * * * *
//   * * * * *







public class Question_1_Solid_Rectangle {
    public static void main(String[] args) {

        int n = 4;  //also take from user 
         int m = 5;
        
        //  outer loop
        for ( int i = 1; i <= n; i = i + 1) {

            // inner loop 
            for (int j = 1; j <= m; j = j + 1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
