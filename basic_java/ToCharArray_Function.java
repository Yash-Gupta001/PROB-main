import java.util.*;


/*
 *  toCharArray() function in Java is used to convert a String into a character array (char[]). It splits the string into individual characters and stores them in the array.
 */



class Data{
    String str[] = new String[1];

    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String you want to sort into char -:");
        str[0]=sc.nextLine();
        sc.close();
    }

    void PrintLogic(){

        char ch[] = str[0].toCharArray();
        for(int i = 0; i < ch.length; i++){
            System.out.print(ch[i] + " ");
        }

    }
}

public class ToCharArray_Function {
    public static void main(String[] args) {
        Data d = new Data();
        d.getData();
        d.PrintLogic();
    }
}
