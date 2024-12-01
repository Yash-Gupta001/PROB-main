package basic_java;
import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int reverse = 0;
        int check = num;

        while (num != 0) {
            int digit = num % 10;               // Extract the last digit
            reverse = reverse * 10 + digit;     // Append the digit to the reversed number
            num /= 10;                          // Remove the last digit from the original number
        }

        if (check == reverse) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("Not a palindrome.");
        }
        System.out.println("Reverse of the number: " + reverse);

        scanner.close();
    }
}
 