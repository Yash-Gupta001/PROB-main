package array_que_50;

import java.util.Scanner;

// Find the average of array elements.

class Average_of_array_implement{
    int sum= 0;
    Scanner sc = new Scanner(System.in);

    Average_of_array_implement(){
        System.out.println("enter length of the array -:");
        int len = sc.nextInt();
        int[] arr1 = new int[len];

        for(int i = 0 ; i < len ; i++){
            System.out.println("enter "+ (i+1)+ " value of array");
            arr1[i] = sc.nextInt();
            sum = sum + arr1[i];
        }

        System.out.println("Average of array is-: " + sum / len);
    }
  
}

public class Average_of_array {
    public static void main(String[] args) {
        Average_of_array_implement a = new Average_of_array_implement();
    }
}
