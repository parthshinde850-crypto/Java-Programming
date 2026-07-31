// Question 2 = print the pattern
//   * * * * * 
//   *       *
//   *       *
//   * * * * *







public class Question_2_Hallow_Rectangle {
    public static void main(String[] args) {
        
        int n = 4;
        int m = 5;

        // Outer loop
        for (int i = 1; i <= n; i = i + 1) {

            // Inner loop
            for (int j = 1; j <= m; j = j + 1) {
                // cell => (i,j)
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        
        }
    }
    
}
