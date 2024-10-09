package hackerrank.easy;
import java.util.*;

public class Int_to_string {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            in.close();

            // Convert integer to string
            String s = Integer.toString(n);

            // Check if the string can be parsed back to the integer
            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } 
}

