class A {
    int a = 20, b = 30;

    public void add() {
        System.out.println("Addition of two variables: " + (a + b));
    }
}

class B extends A {
    public void mul() {
        System.out.println("Multiplication of two variables: " + (a * b));
    }
}

class C extends A {
    public void div() {
        System.out.println("Division of two variables: " + (a / b));
    }
}

class D extends A {
    public void sub() {
        System.out.println("Subtraction of two variables: " + (a - b));
    }
}

public class Hiearchical {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();

        b.mul();
        c.div();
        d.sub();
        d.add();
    }
}
