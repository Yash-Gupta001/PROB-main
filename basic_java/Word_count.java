import java.util.*;

class WordLogic {
    String[] s;
    int n;

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
        int total = 0;

        // Loop for itterating through all string 
        for (int j = 0; j < n; j++) {
            int wordCount = 0;

            // Loop for itterating through current string
            for (int i = 0; i < s[j].length(); i++) {
                char ch = s[j].charAt(i);

                if (ch != ' ') {
                    wordCount++;
                }
            }

            total += wordCount; 
        }

        System.out.println("Total word count: " + total);
    }
}

public class Word_count {
    public static void main(String[] args) {
        WordLogic cl = new WordLogic();
        cl.getData();
        cl.logic();
    }
}
