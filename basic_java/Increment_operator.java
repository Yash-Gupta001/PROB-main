package basic_java;

public abstract class Increment_operator {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;

        // increment 
        System.out.println(++a); // Prefix: Increments first, then prints - Output: 6
        System.out.println(b++); // Postfix: Prints first, then increments - Output: 5
        System.out.println(b);   // Output: 6

        // decrement 
        int c = 5;
        int d = 5;

        System.out.println(--c); // Prefix: Decrements first, then prints - Output: 4
        System.out.println(d--); // Postfix: Prints first, then decrements - Output: 5
        System.out.println(d);   // Output: 4
    }
}
