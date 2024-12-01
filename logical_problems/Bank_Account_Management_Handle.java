import java.util.*;

/*
WAP to print Account Details like Account Name,Account Id,Current Balance, Bank Name, Bank Branch Location,
if you want withdraw some amount then deduct and if deposit then add amount to balance by toString() method in java
*/

class Account{
    String Account_Name;
    String Bank_Name;
    String Account_Id;
    String Branch_Location;
    double Curr_Bal;
    double Deposited_amount = 0;
    double Withdrawled_amount = 0;

    // Account(String Account_Name, String Bank_Name, String Account_Id, String Branch_Location, double curr_bal){
    //     this.Account_Name = Account_Name;
    //     this.Bank_Name = Bank_Name;
    //     this.Account_Id = Account_Id;
    //     this.Branch_Location = Branch_Location;
    //     this.Curr_Bal = Curr_Bal;
    // }

    void AccountDetails(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your name-: ");
        Account_Name = sc.nextLine();

        System.out.println("Enter your Bank name-: ");
        Bank_Name = sc.nextLine();

        System.out.println("Enter your account id -:");
        Account_Id = sc.nextLine();

        System.out.println("Eeter your preferred branch -: \n1) Akola\n2) Gondia\n3) Nagpur\n4) Wardha");
        int branchChoice = sc.nextInt(); 

    switch (branchChoice) {
        case 1:
            Branch_Location = "Akola";
            break;
        case 2:
            Branch_Location = "Gondia";
            break;
        case 3:
            Branch_Location = "Nagpur";
            break;
        case 4:
            Branch_Location = "Wardha";
            break;
        default:
            System.out.println("Invalid choice");
            Branch_Location = "not_avialable"; 
    }

        System.out.println("Enter your current bank balance -:");
        Curr_Bal = sc.nextDouble();

        System.out.println("Do you want to deposite or withdraw money from account ?\npress 1 for make transacn or 0 for print details");
        int transaction = sc.nextInt();

        if(transaction == 1){
            int amount;
            System.out.println("press 1 for deposite and 2 for withdrawl");
            int confirmation = sc.nextInt();

            if(confirmation == 1){
                System.out.println("Enter how much you want to deposite -:");
                amount = sc.nextInt();
                Curr_Bal += amount;
                Deposited_amount = amount;
            }

            else if(confirmation == 2){
                System.out.println("Enter how much money you want to withdrawl");
                amount = sc.nextInt();
                if(amount > Curr_Bal){
                    System.out.println("not enough money in your account");
                }
                else{
                    Curr_Bal -= amount;
                    Withdrawled_amount = amount;
                }
            }
        }

        sc.close();
    }

    public String toString() {
        return "Account name -: "+Account_Name +
        "\nBank name -: "+ Bank_Name + 
        "\nAccount Id -: "+ Account_Id + 
        "\nBranch location -: "+ Branch_Location +
        "\nCurretn balance -: "+ Curr_Bal +
        "\n Deposited amount -: "+ Deposited_amount +
        "\nWithdrawled Amount -:"+ Withdrawled_amount ;
    }

}

public class Bank_Account_Management_Handle{
    public static void main(String args[]){
        Account acc = new  Account();
        acc.AccountDetails();

        System.out.println(acc);
    }
}