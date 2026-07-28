import java.util.*;
public class Input {
    //Input
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();  // Take only one token
        
        System.out.println(name);
   
        sc.close();  // not use then 5 line sc will show yellow underline but not error warning for not close sc

    }
    
}
