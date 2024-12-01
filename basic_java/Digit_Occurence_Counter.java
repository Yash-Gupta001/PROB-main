import java.util.*;

class DigitCounter {
    long number;  

    void inputNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (n): ");
        number = sc.nextLong();
    }

    void countOccurrences() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digit to count: ");
        int digit = sc.nextInt();

        int count = 0;
        long temp = number;

        while (temp > 0) {
            if (temp % 10 == digit) {
                count++;
            }
            temp /= 10;  
        }

        System.out.println("The digit " + digit + " occurs " + count + " times in the number " + number);
        sc.close();
    }
}

public class Digit_Occurence_Counter {
    public static void main(String[] args) {
        DigitCounter counter = new DigitCounter();

        counter.inputNumber();    
        counter.countOccurrences();
    }
}
