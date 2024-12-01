
import java.util.Scanner;


public class Sum_of_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int total = 0 ;
        
        while (n > 0) {
            int digit = n % 10; 
            total += digit;     
            n = n / 10;  
        }
        
        System.out.println("total -: " +total);
        sc.close();

    }

}

/*
 * 1234
 * 1+2+3+4
 * 10
 */
