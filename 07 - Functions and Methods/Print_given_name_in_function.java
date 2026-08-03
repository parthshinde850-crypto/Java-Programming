// Question = print a given name in a function



import java.util.Scanner;

public class Print_given_name_in_function {

    public static void printMyName(String name) {   //function Declared.  and void means no return
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = sc.next();

        printMyName(name);   // call the function
        sc.close();
        
    }
    
}
