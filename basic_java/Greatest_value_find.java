package basic_java;

import java.util.Scanner;

public class Greatest_value_find {
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

        int greatest = a;  

        if (b > greatest) greatest = b;
        if (c > greatest) greatest = c;
        if (d > greatest) greatest = d;
        if (e > greatest) greatest = e;

        // Printing the greatest number
        System.out.println("The greatest number is: " + greatest);

        sc.close();
    }
}
