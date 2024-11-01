package basic_java;
import java.util.*;

public class For_loop_odd {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        for(int i = 1;i <= 10; i++){
            if(i % 2 == 1){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
