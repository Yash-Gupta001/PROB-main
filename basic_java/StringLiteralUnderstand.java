public class StringLiteralUnderstand {
    public static void main(String[] args) {

        String name1 = "tuffy";
        String name2 = "tuffy";
        System.out.println("Are same? " + (name1 == name2)); // true kyunki yahan JVM String pool me reference share kar rahi hai

        String name3 = new String("kaleya");
        String name4 = new String("kaleya");
        System.out.println("Are same? " + (name3 == name4)); // false kyunki yahan `new` keyword use hua hai aur alag-alag memory allocate hui hai

        //string literals ke case mein == reference compare karta hai

        System.out.println("using .equals method to compare values in string literal "+name3.equals(name4)); // true kyuki .equals method string literal me value commpare karta hai na ki reference

    }
}
