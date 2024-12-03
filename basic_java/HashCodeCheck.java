

class Check{
    String str1 = "Hello";
    String str2 = "Hello";

    void getdata(){
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

    }
}


public class HashCodeCheck {
    public static void main(String[] args) {
        Check ch = new Check();
        ch.getdata();
    }
}
