import java.util.*;

class CharacterLogic {
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

        

        for(int j =  0; j < n;j++){

            int count = 0; 
        for (int i = 0; i < s[j].length(); i++) {
            char ch = s[j].charAt(i);

            if (ch != ' ') {
                count++;
            } 
            else if (count > 0) {
                System.out.println("count: " + count);
                count = 0; 
            }
        }      
            System.out.println("count: " + count);
    }
        
    }
}

public class Character_count {
    public static void main(String[] args) {
        CharacterLogic cl = new CharacterLogic();
        cl.getData();  
        cl.logic();    
    }
}
