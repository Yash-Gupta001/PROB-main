
class Example {
    static int a = 5; // Static variable
    int b = 6;        // Non-static variable
}

public class StaticClass {
    public static void main(String[] args) {
        
        System.out.println("ex value");
        Example ex = new Example();
        ex.a = Example.a + 5;
        System.out.println(Example.a);
        ex.b = ex.b + 9;
        System.out.println(ex.b);

        System.out.println("ex1 value");
        Example ex1 = new Example();
        ex1.a = Example.a + 5;
        System.out.println(Example.a);
        ex1.b = ex1.b + 23;
        System.out.println(ex1.b);

        System.out.println("ex3 value");
        Example ex3 = new Example();
        ex3.a = Example.a + 5;
        System.out.println(Example.a);
        ex3.b = ex3.b + 89;
        System.out.println(ex3.b);

    }
}


/*
 * static variable memory is created only one time for all program
 *  
 */