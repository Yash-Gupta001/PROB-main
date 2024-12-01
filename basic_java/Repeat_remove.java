import java.util.*;

class Repeatcheck{
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

    void logicrepeat() {
        for (int j = 0; j < n; j++) {
            String result = "";  

            for (int i = 0; i < s[j].length(); i++) {
                char current = s[j].charAt(i);

                if (result.indexOf(current) == -1) {
                    result += current;  // Concatenate the character if not found
                }
            }

            System.out.println("String without duplicates: " + result);
        }
    }
}

public class Repeat_remove {
    public static void main(String[] args) {
        Repeatcheck pc = new Repeatcheck();
        pc.getData();
        pc.logicrepeat();
    }
}
