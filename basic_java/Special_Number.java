import java.util.*;
/*
A special two digit number is a number such that when 
the sum of its digits is added to the product of its digits, the result should be equal to the original two-digit number. 
Implement a program to accept a two digit number and check whether it is a special two digit number or not. 
12 ====> (1+2)+(1*2) =3+2=5 No 
59 ====> (5+9)+(5*9) =14+45=59 Yes 

 */
class Logic{
    int n;
    int add = 0,mul = 1;

    void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check whether it is special number or not -:");
        n = sc.nextInt();
    }

    void Logic4(){
        int temperory = n;

        while (temperory > 0) {
            int digit = temperory % 10; // to get last digit
            add += digit;  
            mul *= digit;
            temperory = temperory / 10;  // Remove last digit
        }

        // while (n > 0) {
        //     int digit = n % 10; 
        //     mul *= digit;     
        //     n = n / 10;  
        // }

        if ((add + mul) == n) {
            System.out.println(n + " is a special number.");
        } else {
            System.out.println(n + " is not a special number.");
        }

    }
}


public class Special_Number{
    public static void main(String[] args) {
        Logic l = new Logic();
        l.Input();
        l.Logic4();
    }
}