
import java.util.*;

class Convert {
    String str[];
    int n;

    // to get data from user
    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of words you want to convert to char array: ");
        n = sc.nextInt();

        sc.nextLine(); // sc.nextInt() reads the integer but leaves the newline (\n) in the input
                       // buffer. When sc.nextLine() is called immediately after, it reads the leftover
                       // newline, causing it to skip actual input.

        str = new String[n]; // Initialize the array with size n

        for (int i = 0; i < n; i++) {
            System.out.println("Enter word " + (i + 1) + ": ");
            str[i] = sc.nextLine();
        }
        sc.close();
    }

    // to print the char array for each word
    void Print() {
        for (int i = 0; i < str.length; i++) {
            char ch[] = str[i].toCharArray();
            System.out.println("Characters of word " + (i + 1) + ": ");
            for (int j = 0; j < ch.length; j++) {
                System.out.print(ch[j] + " ");
            }
            System.out.println(); // Move to next line after each word
        }
    }
}

public class ToCharArray_Function_multiple {
    public static void main(String[] args) {
        Convert convert = new Convert();
        convert.getData();
        convert.Print();
    }
}
