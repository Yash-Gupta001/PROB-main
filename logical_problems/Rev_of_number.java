import java.util.*;

/**
 * Rev_of_number
 */
public class Rev_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    int n = sc.nextInt() ;
    int comp = n;
    int rev = 0 ;

    while (n!=0){
        int digit = n%10;
        rev = rev * 10 + digit;
        n /= 10;
    }
    System.out.println("rev of a number " + rev);

// palindrome logic
//     if(rev==comp){
//         System.out.println("palindrome " + rev);
//     }
//     else{
//         System.out.println("not palindrome" + rev);
// }

// palindrome logic end

sc.close();
    }
    
}