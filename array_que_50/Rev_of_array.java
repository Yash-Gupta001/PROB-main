package array_que_50;
import java.util.Scanner;

public class Rev_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of array");
        int len = sc.nextInt();
        int[] arr1 = new int[len];

        for(int i = 0 ; i < len ; i++){
            System.out.println("enter "+ (i+1)+ " value of array");
            arr1[i] = sc.nextInt();
        }

        System.out.println("The array elements are:");
        for (int element : arr1) {
            System.out.println(element + " ");
        }

        System.out.println("reverse of array-:");
        for(int i = len-1 ; i >= 0; i--){
            System.out.print(arr1[i]);
        }
        sc.close();
    }
}

// sw
