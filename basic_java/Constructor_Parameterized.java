import java.util.*;

class Parameterized {
    int a, b, c;

    // Default constructor
    Parameterized() {
        a = 7;
        b = 6;
        add(); // Call the add method to compute c
    }

    // Parameterized constructor
    Parameterized(int a, int b) {
        this.a = a; // Assign parameter value to instance variable
        this.b = b; // Assign parameter value to instance variable
        add(); // Call the add method to compute c
    }

    // Method to add and set c
    void add() {
        c = a + b; // Directly set c to the sum of a and b
        System.out.println("Add method called: a = " + a + ", b = " + b + ", c = " + c);
    }
}

public class Constructor_Parameterized {
    public static void main(String[] args) {
        // Creating an instance using the default constructor
        Parameterized obj1 = new Parameterized();
        System.out.println("Default constructor: a = " + obj1.a + ", b = " + obj1.b + ", c = " + obj1.c);

        // Creating an instance using the parameterized constructor
        Parameterized obj2 = new Parameterized(10, 20);
        System.out.println("Object created with parameterized constructor: a = " + obj2.a + ", b = " + obj2.b + ", c = " + obj2.c);
    }
}
