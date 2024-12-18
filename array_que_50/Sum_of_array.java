package array_que_50;
import java.util.*;

// Calculate the sum of all elements in an array.
class Sum_of_array_implement{
    Scanner sc = new Scanner(System.in);
    int sum=0;

    Sum_of_array_implement(){
        System.out.println("enter length of the array -:");
        int len = sc.nextInt();
        int[] arr1 = new int[len];

        for(int i = 0 ; i < len ; i++){
            System.out.println("enter "+ (i+1)+ " value of array");
            arr1[i] = sc.nextInt();
            sum = sum + arr1[i];
        }
        System.out.println("sum of array is-: " + sum);

    }

}


public class Sum_of_array {
    public static void main(String[] args) {
        Sum_of_array_implement sm = new Sum_of_array_implement();
    }
}
