import java.util.*;

class Palindromecheck{
    String[] s;
    int n,flag = 0;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many strings you want: ");
        n = sc.nextInt();
        sc.nextLine();  

        s = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            s[i] = sc.nextLine();
        }
        sc.close();
    }

    void logic() {
        for (int j = 0; j < n; j++) {
            flag = 0;

            for(int i = 0;i < s[j].length()/2;i++){

                if (s[j].charAt(i) != s[j].charAt(s[j].length() - 1 - i)) {
                    flag = 1;  // Not a palindrome
                }

            }

            if(flag == 0){
                System.out.println(s[j]+" is palindrome");
            }

        }
    }
}


public class String_palindrome {
    public static void main(String[] args) {
        Palindromecheck pc = new Palindromecheck();
        pc.getData();
        pc.logic();
    }
}
