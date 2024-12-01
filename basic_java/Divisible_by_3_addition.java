import java.util.*;

class Logic {
    int count = 0;
    int[] arr; 

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int sz = sc.nextInt();  
        arr = new int[sz]; 

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {

                arr[i] = sc.nextInt();
            
        }
        sc.close();
    }

    void Addition() {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 3 == 0){
            count += arr[i];
            }
        }
        System.out.println("The sum of the elements is: " + count);
    }
}

public class Divisible_by_3_addition {
    public static void main(String[] args) {
        Logic logic = new Logic();  
        logic.input();
        logic.Addition();
    }
}
