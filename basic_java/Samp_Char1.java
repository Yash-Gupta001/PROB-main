import java.util.*;

class Demo_charArray {
    String str[] = new String[3];
    int vowel = 0, cons = 0, digit = 0, space = 0;

    void getData() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < str.length; i++) {
            str[i] = scan.nextLine();
        }
    }

    void display() {

        for (int j = 0; j < str.length; j++) {

            char ch[] = str[j].toCharArray();

            for (int i = 0; i < ch.length; i++) {

                if (ch[i] == 'a' || ch[i] == 'i' || ch[i] == 'e' || ch[i] == 'o' || ch[i] == 'u') {
                    vowel++;
                }

                else if (ch[i] == 'A' || ch[i] == 'I' || ch[i] == 'E' || ch[i] == 'O' || ch[i] == 'U') {
                    vowel++;
                }

                else if (ch[i] >= 'A' && ch[i] <= 'Z' || ch[i] >= 'a' && ch[i] <= 'z') {
                    cons++;
                }

                else if (ch[i] >= '0' && ch[i] <= '9') {
                    digit++;
                }

                else if (ch[i] == ' ') {

                    System.out.print("Vowel = " + vowel + "  " + "Consonant=  " + cons + "  " + "Digit = " + digit);
                    vowel = 0;
                    cons = 0;
                    digit = 0;
                }
                System.out.println();

            }
            System.out.print("Vowel = " + vowel + "  " + "Consonant=  " + cons + "  " + "Digit = " + digit);
            vowel = 0;
            cons = 0;
            digit = 0;

        }

    }
}

public class Samp_Char1 {
    public static void main(String args[]) {
        Demo_charArray d = new Demo_charArray();
        d.getData();
        d.display();
    }
}