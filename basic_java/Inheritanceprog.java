import java.util.*;
/*
 * single level inheritance -:
 * In single inheritance, a subclass extends (inherits from) just one superclass. This is the most basic form of inheritance, where one class inherits from another, forming a parent-child relationship.
 */

 class Rect{
    int len,breadth;
    Scanner sc = new Scanner(System.in);

    void getdata(){
    System.out.println("enter length");
    len = sc.nextInt();

    System.err.println("enter breadth");
    breadth = sc.nextInt();

    }
 }

 class Print extends Rect {
    int area(){
        return len*breadth;
    }
 }

 public class Inheritanceprog {
 
    public static void main(String[] args) {
        Print p = new Print();
        p.getdata();
        System.out.println("area-: " + p.area());
    }
 }




 // sw