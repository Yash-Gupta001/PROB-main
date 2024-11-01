

import java.util.Scanner;

public class ArrayEvenSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int sz = sc.nextInt();
        
        int[] numbers = new int[sz];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < sz; i++) {
            numbers[i] = sc.nextInt();
        }
        
        System.out.println("Even numbers in the array are:");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        
        sc.close();
    }
}
