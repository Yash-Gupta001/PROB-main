import java.util.*;

/*
 A duck number is a number which has zeros present in it, 
 but no zero present in the beginning of the number. 
 If any number begins with 0 then it is said to be octal. 
 */

class Logic2 {
    String n;

    void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check whether it is Duck or not:");
        n = sc.nextLine();  // Read input as a string
        sc.close();
    }

    void LogicImplement() {
        // A number start with '0' is octal number
        if (n.charAt(0) == '0') {
            System.out.println(n + " is Octal Number.");
        }
        
        // Check for the of '0' manually
        for (int i = 1; i < n.length(); i++) {  // Start from index 1 to skip the first character
            if (n.charAt(i) == '0') {
                System.out.println("it is duck number");
            }
        }
    }
}

public class Duck_number {
    public static void main(String[] args) {
        Logic2 logic = new Logic2();
        logic.Input();  // Get user input
        logic.LogicImplement();  // Check and print if it's a duck number
    }
}
