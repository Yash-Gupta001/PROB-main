package hackerrank.easy;
import java.util.*;

/**
 * Taking_input
 */
public class Taking_input {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        Double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        char ch;
        ch = scan.next().charAt(0); // for taking input in character 

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        System.out.println("character: " + ch);
        scan.close();
    }
}