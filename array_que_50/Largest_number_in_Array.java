package array_que_50;
import java.util.*;

class InnerLargest_number_in_Array_impl {
    Scanner sc = new Scanner(System.in);
    int max = 0;

    InnerLargest_number_in_Array_impl(){
        System.out.println("enter the length of the array");
        int len = sc.nextInt();
        int[] arr1 = new int[len];

        for(int i = 0; i < len; i++){
            System.out.println("enter "+ (i+1)+ " value of array");
            arr1[i] = sc.nextInt();
        }

        for(int j = 0; j < len; j++){
            if(arr1[j]>max){
                max = arr1[j];
            }
        }
        System.out.println("largest number is " + max);
    }
    
}

// Find the largest element in an array.


public class Largest_number_in_Array {
    public static void main(String[] args) {
        InnerLargest_number_in_Array_impl large = new InnerLargest_number_in_Array_impl();
    }
}
