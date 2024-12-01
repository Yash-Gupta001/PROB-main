#include <iostream>
using namespace std;

class Pattern {
public:
    void logic() {
        int rows;  
        cout << "Enter the number of rows to print: ";
        cin >> rows;
        char ch = 'A';

        for (int i = 0; i < rows; i++) {  
            // ch = 'A';  
            // ch = ch + i; 
            for (int j = 0; j <= i; j++) {  
                cout << ch;
                ch++;
            }
            cout << endl;  
        }
    }
};

int main() {
    Pattern p;
    p.logic();  
    return 0;
}


// output -: 
//
// Enter the number of rows to print: 3
// A
// BC
// DEF