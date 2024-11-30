import java.util.Scanner;

class Sim {
    double speed;
    String Simname;
    String Recharge;

    Sim(String Simname) {
        this.Simname = Simname;
    }

    public void setDetails(double speed, String Recharge) {
        this.speed = speed;
        this.Recharge = Recharge;
    }

    public void displayDetails() {
        System.out.println(Simname + ": Speed = " + speed + " Mbps, Recharge = " + Recharge);
    }
}

class Airtel extends Sim {

    Airtel() {
        super("Airtel");
    }

}

class Idea extends Sim {
    Idea() {
        super("Idea");
    }
}

class Jio extends Sim {
    Jio() {
        super("Jio");
    }
}

public class Siminheritance {
    public static void main(String[] args) {
        int n;
        double speed;
        String Recharge;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 for Airtel\nEnter 2 for Idea\nEnter 3 for Jio");
        n = sc.nextInt();

        sc.nextLine(); 
 
        Sim sim = null;

        if (n == 1) {
            sim = new Airtel();
        } 
        else if (n == 2) {
            sim = new Idea();
        } 
        else if (n == 3) {
            sim = new Jio();
        } 
        else {
            System.out.println("Invalid option");
        }

        System.out.println("Enter speed: ");
        speed = sc.nextDouble();

        sc.nextLine(); 

        System.out.println("Enter Recharge plan: ");
        Recharge = sc.nextLine();

        sim.setDetails(speed, Recharge);

        sim.displayDetails();

        sc.close();
    }
}