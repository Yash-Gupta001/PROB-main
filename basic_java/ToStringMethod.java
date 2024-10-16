
import java.util.*;

class employee {
    String name;
    int age;
    int salary;
    char gender;

    void getdata() {
        System.out.println("enter name,age,salary,gender");
        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();
        age = scan.nextInt();
        salary = scan.nextInt();
        gender = scan.next().charAt(0);
        scan.close();
    }

    public String toString() {
        return "My name is :::  " + name + "\n" + "Your age ::: " + age + "\n" + "Your salary is ::: " + salary + "\n"
                + "Gender ::: " + gender;
    }
}

public class ToStringMethod {
    public static void main(String[] arg) {
        employee e = new employee();
        e.getdata();
        System.out.println(e);
    }
}

/*



 */