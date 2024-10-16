import java.util.*;

/*
The discount value is calculated as the sum of all prime digits in the total bill amount. 
Write an algorithm to find the discount value for the given total bill amount. 
12500.00 ====> 2+5=7% 
12540.00 ====> 2+5=7% 
*/

class DiscountLogic {
    int n, calc = 0;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter bill amount:");
        n = sc.nextInt();
        sc.close();
    }

    void Logic() {
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;

            if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {  
                calc += digit;
            }
            temp = temp / 10;
        }

        // for setting max discount
        if(calc > 50){
            calc = 50;
        }

        System.out.println("You got total " + calc + "% discount on your bill");
        System.out.println("Your total bill after discount is: " + (n - (n * calc / 100.0)));
    }
}

public class Discount_calculate {
    public static void main(String[] args) {
        DiscountLogic dl = new DiscountLogic();
        dl.input();
        dl.Logic();
    }
}
