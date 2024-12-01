package basic_java;

import java.util.*;

class Method {

    void calculate(double num1, double num2, char op) {
        switch (op) {
            case '+':
                System.out.println("Addition: " + (num1 + num2));
                break;

            case '-':
                System.out.println("Subtraction: " + (num1 - num2));
                break;

            case '*':
                System.out.println("Multiplication: " + (num1 * num2));
                break;

            case '/':
                if (num2 != 0) {
                    System.out.println("Division: " + (num1 / num2));
                } else {
                    System.out.println("Error! Division by zero.");
                }
                break;

            default:
                System.out.println("Invalid operator.");
                break;
        }
    }
}

public class Prog_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char op;
        double num1, num2;

        System.out.println("Enter first number: ");
        num1 = sc.nextDouble();

        System.out.println("Enter second number: ");
        num2 = sc.nextDouble();

        System.out.println("Enter an operator +, -, *, /: ");
        op = sc.next().charAt(0);

        Method method = new Method();
        method.calculate(num1, num2, op);

        sc.close();
    }
}
