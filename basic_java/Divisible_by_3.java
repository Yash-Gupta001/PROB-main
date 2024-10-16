import java.util.*;
public class Divisible_by_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n%3==0){
            System.out.println("divisible by 3" +n);
        }
        else{
            System.out.println("not divisible");
        }
        sc.close();
    }
}
