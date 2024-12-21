package array_que_50;
import java.util.*;

class InnerOccurence_count_implement {
    int occurence, counter = 0;
    Scanner sc = new Scanner(System.in);
    InnerOccurence_count_implement(){
        System.out.println("enter the length of the array");
        int len = sc.nextInt();
        int[] arr1 = new int[len];

        for(int i = 0; i < len; i++){
            System.out.println("enter "+ (i+1)+ " value of array");
            arr1[i] = sc.nextInt();
        }
        
        System.out.println("enter the element to check its occurence in an array-: ");
        int occurence = sc.nextInt();

        for(int i = 0; i < len; i++){
            if(occurence == arr1[i]){
                counter++;
            }
        }

        System.out.println("the number appeared " + counter + " times.");


    } 
    
}

// Count the occurrences of a specific element in an array.
public class Occurence_count {
    public static void main(String[] args) {
        InnerOccurence_count_implement in = new InnerOccurence_count_implement();
    }
}
