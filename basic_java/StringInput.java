
import java.util.*;

public class StringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Str1,Str2;
        
        // for taking input of total line
        Str1 = sc.nextLine();        
        
        // for single   
        Str2 = sc.next(); 

        System.out.println(Str1);
        System.out.println(Str2);
        sc.close();
    }
    
}
