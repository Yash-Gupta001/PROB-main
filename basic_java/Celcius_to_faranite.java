import java.util.*;


class Logic3{
    double cel ,fer; 
    int n;
    
    void LogicCelc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to convert Celsius to Fahrenheit \nEnter 2 to convert Fahrenheit to Celsius");
        n = sc.nextInt();
        switch (n) {

            case 1:  
                System.out.println("Enter celcius"); 
                cel = sc.nextDouble();
                fer = (cel * 9/5)+32 ;
                System.out.println(fer);;
                break;
        
            case 2:
            System.out.println("Enter Fahrenheit"); 
                fer = sc.nextDouble();
                cel = (fer-32)*5/9;
                System.out.println(cel);
                break;
        }
        sc.close();
    }
}


public class Celcius_to_faranite {
    public static void main(String[] args) {
        Logic3 log = new Logic3();
        log.LogicCelc();
    }
}