package basic_java;
import java.util.*;


/*
Niven Number is that a number which is divisible by its sum of digits. 
*/
class Logic{
    int n;
    int add = 0;

    void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check whether it is special number or not -:");
        n = sc.nextInt();
    }

    void Logic5(){
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10; // to get last digit
            add += digit;  
            temp = temp / 10;  // Remove last digit
        }

        if((n % add) == 0){
            System.out.println("it is Niven number -: "+n);
        }
        else{
            System.out.println("it is Not Niven number -: "+n);   
        }
    }
}



public class Niven_Number{
     public static void main(String[] args) {
        Logic l = new Logic();
        l.Input();
        l.Logic5();
    }
}