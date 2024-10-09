package basic_java;

import java.util.Scanner;

public class Greatest_value_find_using_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, e;

        System.out.println("Enter number 1:");
        a = sc.nextInt();
        System.out.println("Enter number 2:");
        b = sc.nextInt();
        System.out.println("Enter number 3:");
        c = sc.nextInt();
        System.out.println("Enter number 4:");
        d = sc.nextInt();
        System.out.println("Enter number 5:");
        e = sc.nextInt();

        int greatest = a; // Assume the first number is the greatest initially

        // Determine the greatest number using &&
        if (b > greatest && b >= a && b >= c && b >= d && b >= e) {
            greatest = b;
        }
        if (c > greatest && c >= a && c >= b && c >= d && c >= e) {
            greatest = c;
        }
        if (d > greatest && d >= a && d >= b && d >= c && d >= e) {
            greatest = d;
        }
        if (e > greatest && e >= a && e >= b && e >= c && e >= d) {
            greatest = e;
        }

        // Print the greatest number
        System.out.println("The greatest number is: " + greatest);

        sc.close();
    }
}
