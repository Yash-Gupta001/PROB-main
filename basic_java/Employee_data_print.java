import java.util.*;

class Take_data {

    int age, dob;
    double sal;
    char gen;
    String name;

    // Constructor for the fields
    Take_data(int age, int dob, double sal, char gen, String name) {
        this.age = age;
        this.dob = dob;
        this.sal = sal;
        this.gen = gen;
        this.name = name;
    }

    // toString() to return a string of the employee 
    public String toString() {
        return "Employee Name: " + name + "\n" +
               "Age: " + age + "\n" +
               "Date of Birth: " + dob + "\n" +
               "Salary: " + sal + "\n" +
               "Gender: " + gen;
    }
}

class Print_Data extends Take_data {

    // Constructor of Print_Data calls the constructor of Take_data using 'super'
    Print_Data(int age, int dob, double sal, char gen, String name) {
        super(age, dob, sal, gen, name); // Calling the parent constructor which is Take_Data( super keyword se hum parent class ke method ko pint krte hai aur this keyword se current class ki)
    }

    // to print employee details
    void EmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Salary: " + sal);
        System.out.println("Gender: " + gen);
    }
}

public class Employee_data_print {
    public static void main(String[] args) {
        // Creat an object of Print_Data with employee data
        Print_Data e1 = new Print_Data(22, 171102, 25000, 'M', "Yash");

        // Calling the EmployeeDetails() method to print employee details
        e1.EmployeeDetails();
        
        System.out.println("\nUsing toString:");
        System.out.println(e1); 
    }
}


/*1) java me hum inheritance extends keyword se use krte hai 
 *2) super keyword is used to accessing  parent class methods and constructors
 *3) toString() method is stored in object. just call the object tovtring is called 
 */
