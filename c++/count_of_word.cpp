#include <iostream>
#include <string>
using namespace std;

int main() {
    string sen;
    cout << "Enter a sentence: ";
    getline(cin, sen);

    int count = 0;
    
    for (char ch : sen) {
        
        if (ch == ' ') {
            count++;
        } 
        
    }
    cout << count+1;
    return 0;
}
