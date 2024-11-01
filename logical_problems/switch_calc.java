
import java.util.Scanner;

public class switch_calc {
    public static void main(String[] args) {
        char op;
        float num1, num2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an operator (+, -, *, /): ");
        op = scanner.next().charAt(0);

        System.out.print("Enter two numbers: ");
        num1 = scanner.nextFloat();
        num2 = scanner.nextFloat();

        switch (op) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;

            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;

            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;

            case '/':
                if (num2 != 0)
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                else
                    System.out.println("Error! Division by zero.");
                break;

            default:
                System.out.println("Operator is not correct.");
                break;
        }

        scanner.close();
    }
}
