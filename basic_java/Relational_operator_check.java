package basic_java;

import java.util.*;

public class Relational_operator_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter value of b: ");
        int b = sc.nextInt();

        System.out.println("a == b: " + (a == b));  
        System.out.println("a != b: " + (a != b));
        System.out.println("a < b: " + (a < b));   
        System.out.println("a > b: " + (a > b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a >= b: " + (a >= b));

        sc.close();
    }
}

/*
 * flow of java prog
 * 1) comment
 * 2) package
 * 3) import
 * 4) main
 */
