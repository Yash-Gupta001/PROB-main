package basic_java;
import java.util.*;

class Logic {
    public void Primecheck(int[] number) {
        System.out.println("Prime numbers in the array are:");
        for (int i = 0; i < number.length; i++) {

            if (isPrime(number[i])) {
                System.out.println(number[i]);
            }

        }
    }

    boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int j = 2; j <= n / 2; j++) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }
}

public class ArrayPrimeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int sz = sc.nextInt();
        int[] number = new int[sz];

        System.out.println("Enter the elements of the array: eun");
        for (int i = 0; i < sz; i++) {
            number[i] = sc.nextInt();
        }

        Logic p = new Logic();
        p.Primecheck(number);  

        sc.close();
    }
}
