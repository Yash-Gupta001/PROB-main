import java.util.Scanner;

class Example{
    int a , b , c=0;

    Example(){
        System.out.println("hello world");
    }

    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a");
        a = sc.nextInt();
        System.out.println("enter value of b");
        b = sc.nextInt();
        c = a + b;
        System.out.println(c);
    }
}

public class ConstructorIn_java {
    public static void main(String[] args) {
        Example ex = new Example();
        ex.getData();

        Example ex1 = new Example();
        ex1.getClass();


    }
}


/*
 * constructor have same namme as a class
 * constructor is called during object creation
 * constructor do not have any return type
 * 
 */