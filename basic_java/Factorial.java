import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,res = 1;
        System.out.println("enetr number for factorial");
        n  = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            res *= i; 
        }
        
        System.out.println(res);
        sc.close();
    }
}
