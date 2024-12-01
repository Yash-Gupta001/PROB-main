package basic_java;
import java.util.*;

class Demo {
    int a, b, c;

    void getData() {
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        scan.close();
    }

    int sum() {
        return (a + b);
    }

    public String toString() {
        return " " + (a + b);
    }
    
}

public class Method_Demo {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.getData();
        System.out.println("Object class hashcode1 " + d.hashCode());
        System.out.println("Object class Reference value " + d);// d.toString()

        Demo d1 = new Demo();
        d1.getData();
        System.out.println("Obect class hashcode2 " + d1.hashCode());
        System.out.println("Object class Reference value  " + d1);

    }
}

// sw