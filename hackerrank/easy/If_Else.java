// conditions-:
// If N is odd, print Weird
// If N is even and in the inclusive range of  2 to 5, print Not Weird
// If N is even and in the inclusive range of  6 to 20, print Weird
// If N is even and greater than 20, print Not Weird

package hackerrank.easy;

import java.util.*;

public class If_Else {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if((N%2 == 1) || (N>=6 && N<=20))
// there are two conditions if number is odd and is in range 6-20 no matter it is even we have to print Weird and for two conditions we used AND operator
        {
            System.out.println("Weird");
        }
        else
// otherwise we have to print Not Weird
        {
            System.out.println("Not Weird");
        }
        scanner.close();
    }
}
