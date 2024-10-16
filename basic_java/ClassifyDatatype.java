
import java.util.*;

public class ClassifyDatatype {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vo_count = 0;
        int num_count = 0;
        int con_count = 0;
        int space_count = 0;
        int sp_count = 0;

        System.out.print("Enter a character: ");
        char ch = sc.nextLine().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            //vo_count++;
            System.out.println("vowel");
        }

        else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            //con_count++;
            System.out.println("consonant");
        }

        else if (ch >= '0' && ch <= '9') {
            //num_count++;
            System.out.println("integer");
        }

        else if (ch == ' ') {
            //space_count++;
            System.out.println("space");
        } 
        else {
            System.out.println("special character");
            sp_count++;
        }

        // System.out.println("Vowel count: " + vo_count);
        // System.out.println("Consonant count: " + con_count);
        // System.out.println("Number count: " + num_count);
        // System.out.println("space count: " + space_count);

        sc.close();
    }
}
