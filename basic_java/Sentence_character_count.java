import java.util.*;

class SentenceLogic {
    int n;
    String[] s;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many string you want to type: ");

        n = sc.nextInt();
        sc.nextLine();  

        s = new String[n]; 

        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) );
            s[i] = sc.nextLine();
        }
        sc.close();
    }

    void logic() {
        int count = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < s[i].length(); j++) {
                if (s[i].charAt(j) != ' ') {
                    count++;
                }
            }
        }

        System.out.println("Total character count :- " + count);
    }
}

public class Sentence_character_count {
    public static void main(String[] args) {
        SentenceLogic cl = new SentenceLogic();
        cl.getData();  
        cl.logic();   
    }  
}