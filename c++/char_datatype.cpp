#include <iostream> 
using namespace std;

int main(){
    char c;
    cin >> c;          // Read a single character

    char str[100];     // Define a character array with a fixed size
    cin >> str;        // Read a string into the character array
    //cin.get(str);
    cout << str << endl;   // Output the string
    cout << c << endl;     // Output the single character

    // Different ways to initialize a string
    string str1 = "Hello, World!";
    string str2("Hello, C++!");
    string str3;
    str3 = "String example";
    //cin.get(str3);

    // Outputting the strings
    cout << str1 << endl;
    cout << str2 << endl;
    cout << str3 << endl;

    // for printing total line 
    cout << "enter val";
    char val[100];
    cin >> val;
    cin.get(val,100);
    cout << val;
    
    return 0;
}
/*
even upper
odd lo
*/
