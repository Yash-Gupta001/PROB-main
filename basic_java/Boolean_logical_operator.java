
/**
 * Boolean_logical_operator
 */
public class Boolean_logical_operator {
    public static void main(String[] args) {
        int a =2,b=5,c=3;
        if((a++ > b) | (b++ < c)){

        }
        System.out.println(a);
        System.out.println(b);
    }
}

/*
 * if we use single & (AND) in logical operation and first condition is false it will still check the second condition knowing that first is false.
 * and same for | (OR) 
 */

/*
 * output-:
 * 3
 * 6
*/

