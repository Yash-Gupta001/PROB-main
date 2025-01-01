


/*
 * 
 * 
Unchecked Exceptions
These are exceptions that occur at runtime and are not checked during compilation.
They are subclasses of RuntimeException.

Examples:
ArithmeticException
NullPointerException
ArrayIndexOutOfBoundsException
IllegalArgumentException
 * 
 * 
 */




// TryCatchExample class ka use karke unchecked exceptions handle karte hain

import java.util.Scanner;

class TryCatchExample {

    // ArithmeticException handle karne wala method
    void ArithmeticException() {
        try {
            // Yeh line ArithmeticException throw karegi kyunki 50 ko 0 se divide kar rahe hain
            int data = 50 / 0;
            System.out.println("rest of the code"); // Yeh line execute nahi hogi
        } catch (ArithmeticException e) {
            // Exception ka message print karega
            System.out.println(e);
        }
    }

    // NullPointerException handle karne wala method
    void NullPointerException() {
        try {
            // Ek null reference create karte hain
            String str = null;
            // Null reference par method call karenge jo NullPointerException throw karega
            System.out.println(str.length());
        } catch (NullPointerException e) {
            // Exception ka message print karega
            System.out.println(e);
        }
    }

    // ArrayIndexOutOfBoundsException handle karne wala method
    void ArrayIndexOutOfBoundsException() {
        try {
            // Ek array define karte hain
            int[] number = {1, 2, 3, 4, 5};
            // Array ke valid index ke bahar ka element access karte hain
            System.out.println(number[9]); // Yeh line exception throw karegi
        } catch (ArrayIndexOutOfBoundsException e) {
            // Exception ka message print karega
            System.out.println(e);
        }
    }



    // Helper method to validate age
    void IllegalArgumentException() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();
        // Agar age invalid hai to exception throw karte hain
        if (age < 0 || age > 80) {
            throw new IllegalArgumentException("Age must be between 0 and 80");
        } 
        else {
            System.out.println("Age is set to: " + age);
        }
        sc.close();
    }
}

// Main class jisme exception handling methods call karte hain
public class UnChecked_ExceptionHandling {
    public static void main(String[] args) {
        // TryCatchExample class ka object banate hain
        TryCatchExample t = new TryCatchExample();

        // ArithmeticException handle karne wala method call karte hain
        t.ArithmeticException();

        // NullPointerException handle karne wala method call karte hain
        t.NullPointerException();

        // ArrayIndexOutOfBoundsException handle karne wala method call karte hain
        t.ArrayIndexOutOfBoundsException();

        // IllegalArgumentException handle karne wala method call karte hain
        t.IllegalArgumentException();
    }
}


