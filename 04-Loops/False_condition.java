public class false_condition {
    public static void main(String[] args) {
        int i = 12;   // no output because false condition and it check condition first
        while (i < 11) {
            System.out.println("parth");
            i = i + 1;
        }

        do {
            System.out.println("parth");    // once print because condition later check
        } while (i < 1);
    }
    
}
