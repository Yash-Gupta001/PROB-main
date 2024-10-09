#include <iostream>
using namespace std; 

int main() {
    string str = "";
    cout << "Enter a string to reverse: " << endl;
    getline(cin, str);
    int n = str.length();
    
    for (int i = 0; i < n / 2; i++)
    {
        char tem = str[i];
        str[i] = str[n - i - 1];
        str[n - i - 1] = tem;
    }
    
    cout << "Reversed: " << str << endl; 
    return 0;
}
