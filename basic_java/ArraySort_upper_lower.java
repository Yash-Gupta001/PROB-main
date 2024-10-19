import java.util.*;

class Demo23 {
    String str[] = new String[20];
    int size;
    Scanner scan = new Scanner(System.in);

    void getData() {
        size = scan.nextInt();
        scan.nextLine(); 

        for (int i = 0; i < size; i++) {
            str[i] = scan.nextLine();
        }
    }

    void logic() {
        int p = 0;

        for (int i = 0; i < size; i++) {
            char ch[] = str[i].toCharArray();// h e l l o
            for (int j = 0; j < ch.length; j++) {

                if (ch[j] >= 'A' && ch[j] <= 'Z' || ch[j] >= 'a' && ch[j] <= 'z') {

                    if (p % 2 == 0) {

                        if (ch[j] >= 'a' && ch[j] <= 'z') {
                            System.out.print(ch[j]);
                        }

                        else {
                            int k;
                            k = ch[j] + 32;
                            System.out.print((char) k);
                        }

                    }

                    else {

                        if (ch[j] >= 'A' && ch[j] <= 'Z') {
                            System.out.print(ch[j]);
                        }

                        else {
                            int k;
                            k = ch[j] - 32;
                            System.out.print((char) k);
                        }

                    }
                    p++;
                }

                else if (ch[j] == ' ') {
                    System.out.print(" ");
                    p = 0;
                }
            }
            p = 0;
            System.out.println();
        }
    }
}

public class ArraySort_upper_lower {
    public static void main(String[] args) {
        Demo23 d = new Demo23();
        d.getData();
        d.logic();
    }
}

// class LogicImplement{
// String[] s;
// int n;

// void getData() {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter how many strings you want: ");
// n = sc.nextInt();
// sc.nextLine();

// s = new String[n];

// for (int i = 0; i < n; i++) {
// System.out.print("Enter string " + (i + 1) + ": ");
// s[i] = sc.nextLine();
// }
// sc.close();
// }

// void logicswitch() {
// for (int j = 0; j < n; j++) {
// String newString = "";

// for (int i = 0; i < s[j].length(); i++) {
// char ch = s[j].charAt(i);

// if (i % 2 == 0) {
// newString += Character.toLowerCase(ch);
// }
// else {
// newString += Character.toUpperCase(ch);
// }
// }
// System.out.println("Modified string " + (j + 1) + ": " + newString);
// }
// }
// }

// public class ArraySort_upper_lower {
// public static void main(String[] args) {
// LogicImplement l = new LogicImplement();
// l.getData();
// l.logicswitch();
// }

// }
