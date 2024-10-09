package hackerrank.easy;

import java.io.IOException;
import java.util.Scanner;

public class Print_table {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 1;i<=10;i++){
            System.out.println(N+" x "+i+" = "+(N*i));
        }
        
        sc.close();
    }
}
