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
/*
 * 
 * by taking int 
 * 
 * import java.util.*;

class Samp_Demo2222 {

    int value, digit;
    int p = 0;
    int size;
    boolean duckContain = false;

    Scanner scan = new Scanner(System.in);

    void getData() {
        System.out.println("Enter the size:");
        size = scan.nextInt();

        System.out.println("Enter the number:");
        value = scan.nextInt();

        System.out.println("Value entered: " + value);
    }

    void logic() {
        int originalValue = value;
        p = 0;
        int temp = value;

        while (value > 0) {
            digit = value % 10;
            if (digit == 0 && p > 0) {
                duckContain = true;
            }
            value = value / 10;
            p++;
        }

        System.out.println("Total digits: " + p);

        if (size != p) {
            System.out.println("0" + temp + " is an Octal number");
        } else if ((size == p) && duckContain) {
            System.out.println(temp + " is a Duck number");
        } else {
            System.out.println("Not an Octal number and Not a Duck number");
        }
    }
}

public class Duck_Demo {
    public static void main(String[] args) {
        Samp_Demo2222 s = new Samp_Demo2222();
        s.getData();
        s.logic();
    }
}
 */