/*
 * Swap variable without using third variable
*/

import java.util.*;

public class Swap_without_third_variable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("Enter any two number");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Before swapping"+a+" "+b);
        // suppose a=100 & b=200
        a = a+b; 
        // then a = 100+200
        //a=300
        b = a-b;
        // b = 300 - 200
        // b= 100
        a = a-b;
        // a=200
        System.out.println("After swapping"+a+" "+b);
        sc.close();
    }
}
