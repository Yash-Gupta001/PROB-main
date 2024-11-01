package basic_java;

public class Fibonacci {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, fibo;
        int number = 20;

        System.out.println("Fibonacci sequence up to " + number + " terms:");

        // Printing the first two numbers
        System.out.println(n1);
        System.out.println(n2);

        // Loop starts from the 3rd term

        for (int i = 2; i < number; i++) {
            fibo = n1 + n2; // Fibonacci is the sum of the two previous terms
            System.out.println(fibo);
            // Update for the next iteration
            n1 = n2;
            n2 = fibo;
        }

    }
}
