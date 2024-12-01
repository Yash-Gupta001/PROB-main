package basic_java;

import java.util.*;

class SumLogic {

    public void EvenSum() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of x:");
        int x = sc.nextInt();
        System.out.println("Enter the value of y:");
        int y = sc.nextInt();

        // Ensure x is less than or equal to y
        if (x > y) {
            System.out.println("x should be less than y.");
        }

        int sum = 0;

        // Calculate the sum of even numbers between x and y
        for (int i = x; i <= y; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("Sum of even numbers between " + x + " and " + y + " is: " + sum);
        sc.close();
    }
}

public class Range_of_even_Sum {
    public static void main(String[] args) {

        SumLogic logic = new SumLogic();
        logic.EvenSum();
    }
}
