class StringBufferImplementation {

    // deleteCharAt method StringBuffer meparticular kisi index se uss character ko hatane ke liye use hota hai
    StringBuffer buf4=new StringBuffer("Hello Good Evening");
    void deleteCharAtImpl(){
        buf4.deleteCharAt(11);
        System.out.println("deleteCharAt method of StringBuffer-: \n "+buf4 + "\n");
    }

    // delete method StringBuffer me kisi ek partiular range of index to delete karne ke liye use hota hai
    StringBuffer B2 = new StringBuffer("hello good morning");
    void deleteimpl(){
        B2.delete(3, 7);
        System.out.println("delete method of StringBuffer-: \n "+B2 + "\n");

    }

    // Append method StringBUffer me 2 ya 2 se jada string ko concatinate karne ke liye use hota hai 
    StringBuffer B3 = new StringBuffer("hello good morning");
    String str2 = new String(" java");

    void AppendImpl(){
        B3.append(str2);
        System.out.println("Append method of String buffer-: \n"+B3);
        B3.append(" this is a new day ").append(" have a great start ").append(2);
        System.out.println("Append method of String buffer multiple time -: \n"+B3+"\n");

    } 

    //  Capacity and length StringBuffer me capacity aur length janne ke liye use hote hai
    StringBuffer B4 = new StringBuffer("good");
    void CapacityAndLengthImpl(){
        System.out.println(B4.capacity());//20
        // capacity ka answer 20 isiliye aaya kyuki Stringbuffer me bydefault size 16 pehle se hota hai aur baki jitni length ho uska add matlab 16+4=20 
		System.out.println(B4.length() + "\n");//4
        // length string string me kitne character hai woh return karta hai so answer is 4
    }

    // reverse is used to reverse the stringbufffer 
    StringBuffer  B5 = new StringBuffer("Reverse");
    void ReverseImpl(){
        System.out.println("Reverse used in stringBuffer-: \n" + B5.reverse() + "\n");
    }

    //Substring use hota hai taki hum puri string se ek part le sake 
    StringBuffer  B6 = new StringBuffer("Substring Implemntation Example");

    void SubStringImpl(){
        System.out.println("Original String "+B6);
        System.out.println("Substring String without giving ending point -: \n" + B6.substring(6));
        System.out.println("Substring String without giving ending point -: \n" + B6.substring(6,9) + "\n");
    }
		
    // insert is used to insert the data in a given index of a String
    StringBuffer B7 = new StringBuffer("Insert method example");
    void InsertImpl(){
        System.out.println("Insert method -: \n" + B7.insert(6," hello") + "\n");
    }

    void equalImpl(){
        StringBuffer B7 = new StringBuffer("Insert method example");
        StringBuffer B8 = new StringBuffer("Insert method example");

        System.out.println(B7.equals(B8));
        System.out.println(B7 == B8);
    }

    

}

// sw


public class StringBufferFunction {
    public static void main(String[] args) {
        StringBufferImplementation s = new StringBufferImplementation();
        s.deleteCharAtImpl();
        s.deleteimpl();
        s.AppendImpl();
        s.CapacityAndLengthImpl();
        s.ReverseImpl();
        s.SubStringImpl();
        s.InsertImpl();
        s.equalImpl();
    }  
}


/*
 * output -:
 deleteCharAt method of StringBuffer-: 
 Hello Good vening

delete method of StringBuffer-: 
 helood morning

Append method of String buffer-:
hello good morning java
Append method of String buffer multiple time -:
hello good morning java this is a new day  have a great start 2

20
4

Reverse used in stringBuffer-:
esreveR

Original String Substring Implemntation Example
Substring String without giving ending point -:
ing Implemntation Example
Substring String without giving ending point -: 
ing

Insert method -:
Insert hello method example
 * 
 * 
 */