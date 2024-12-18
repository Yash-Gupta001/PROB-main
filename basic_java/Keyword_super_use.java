import java.util.*;

class SampBase1 {
    int length, breadth;
    // Scanner scan = new Scanner(System.in);

    SampBase1(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}

class SampDerived1 extends SampBase1 {

    SampDerived1(int l, int b) {
        super(l, b);
    }

    int area() {
        return length * breadth; // 3*4=12
    }

}

public class Keyword_super_use {
    public static void main(String[] args) {
        SampDerived1 d = new SampDerived1(7, 4);
        System.out.println("Area of Rectangle :::: " + d.area());
    }
}