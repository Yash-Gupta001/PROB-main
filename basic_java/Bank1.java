
import java.util.*;
class Bankdetail
{
 String name;
 int id;
 int currentbalance;
 String BN;
 String BBL; 
 int num;
 int amount;
String blank;

 void getdata()
{
 Scanner scan=new Scanner(System.in);

 System.out.println("Enter Name");
 name=scan.nextLine();

 System.out.println("Enter ID");
 id=scan.nextInt();

scan.nextLine();

 System.out.println("Enter Current Balance");
 currentbalance=scan.nextInt();

scan.nextLine();


System.out.println("Enter Bank Name");
 BN=scan.nextLine();


 System.out.println("Enter Branch Location");
 BBL=scan.nextLine();
 scan.close();
}
 void logic()
{
 System.out.println("Type 0 for Withdraw OR type 1 for Deposit");
 Scanner scan=new Scanner(System.in);
 num=scan.nextInt();
 switch(num)
{
 case 0:
 System.out.println("Enter the withdrawal amount");
 amount=scan.nextInt();
 currentbalance=(currentbalance-amount);
 break;
 case 1:
 System.out.println("Enter the Deposit amount");
 amount=scan.nextInt();
 currentbalance=(currentbalance+amount);
 break;
 default:
 System.out.println("Wrong choice");
}
scan.close();
}
 public String toString()
{
 return "Account Holder Name="+name+"\n"+"Account id="+id+"\n"+"Current Balance="+currentbalance+"\n"+"Bank Name="+BN+"\n"+"Bank Branch Location="+BBL;
}
}
public class Bank1
{
public static void main(String []arg)
{
 Bankdetail b=new Bankdetail();
 b.getdata();
 b.logic();
 System.out.println(b);
}
}