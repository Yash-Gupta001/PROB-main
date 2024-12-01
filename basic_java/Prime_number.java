package basic_java;
import java.util.*;

public class Prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number till need prime number");
        int n = sc.nextInt();
        
        for (int i = 2; i <= n; i++) {  

            boolean isPrime = true;  // Assume i is prime
    
            for (int j = 2; j <= i / 2; j++) {
    
                if (i % j == 0) {  
                    isPrime = false;  // i is not prime
                    break;
                }
            }
            
            if (isPrime) {
                System.out.println(i);  // Print the prime number
            }
        }
        
        sc.close();
    }
}
