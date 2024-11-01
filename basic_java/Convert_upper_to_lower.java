
import java.util.Scanner;

public class Convert_upper_to_lower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character: ");
        char ch = sc.nextLine().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            // Convert uppercase to lowercase 
            char lw =  (char) (ch + 32);
            System.out.println("Lowercase : " + lw);
        }

        else if (ch >= 'a' && ch <= 'z') {
            // Convert lowercase to uppercase 
            char up = (char) (ch - 32);
            System.out.println("Uppercase : " + up);
        } 

        else{
            System.out.println("invalid input");
        }
        sc.close();
    }
}

/*
 * 
 */