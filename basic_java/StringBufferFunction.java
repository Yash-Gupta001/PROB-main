

class StringBufferImplementation {

    StringBuffer B = new StringBuffer("hello good morning");
    String str = new String("java");

    void deleteCharAtimpl(){
        B.deleteCharAt(6);
        System.out.println(B);
    }

    StringBuffer B2 = new StringBuffer("hello good morning");
    void deleteimpl(){
        B2.delete(3, 7);
        System.out.println(B2);

    }

    StringBuffer B3 = new StringBuffer("hello good morning");
    String str2 = new String(" java");

    void AppendImpl(){

        B3.append(str2);
        System.out.println(B3);

    } 

    // void 

}

// sw


public class StringBufferFunction {
    public static void main(String[] args) {
        StringBufferImplementation s = new StringBufferImplementation();
        s.deleteCharAtimpl();
        s.deleteimpl();
        s.AppendImpl();

    }  
}