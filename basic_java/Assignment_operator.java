
import java.util.*;
public class Assignment_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("enter value of a");
        int a = sc.nextInt();

        for(int i= 0; i <= 10; i++){
            a += i;
        }
        System.out.println(a);

        for(int i= 0; i <= 10; i++){
            a -= i;
        }
        System.out.println(a);

        for(int i= 0; i <= 10; i++){
            a *= i;
        }
        
        System.out.println(a);

        for(int i= 0; i <= 10; i++){
            a /= i;
        }
        System.out.println(a);

        sc.close();
    }
}
