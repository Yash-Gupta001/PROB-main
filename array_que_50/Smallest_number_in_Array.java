package array_que_50;
import java.util.Scanner;

class Smallest_number_in_Array_Impl{
    Scanner sc = new Scanner(System.in);

    Smallest_number_in_Array_Impl(){
        System.out.println("enter the length of the array");
        int len = sc.nextInt();
        int[] arr1 = new int[len];

        for(int i = 0; i < len; i++){
            System.out.println("enter "+ (i+1)+ " value of array");
            arr1[i] = sc.nextInt();
        }

        int min = arr1[0];

        for(int j = 0; j < len; j++){

            if(arr1[j]<min){
                min = arr1[j];
            }
        }
        System.out.println("smalest number is " + min);
    }

}

// Find the smallest element in an array.

public class Smallest_number_in_Array {
    public static void main(String[] args) {
        Smallest_number_in_Array_Impl small = new Smallest_number_in_Array_Impl();
    }
}
