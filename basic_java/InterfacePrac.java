

interface interface01 {
    public static void display() {
        System.out.println("display method");
    }
    int speed = 23;
}

class Derived implements interface01 {

    public void display() {
        System.out.println("display method2");
    }

}

public class InterfacePrac {
    public static void main(String[] args) {
        interface01.display();
        Derived d = new Derived();
        // d.log();
        // System.out.println("Speed: " + interface01.speed);
    }
}

	
	 
// sw