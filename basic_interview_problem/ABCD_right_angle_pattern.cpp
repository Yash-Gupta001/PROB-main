#include <iostream>
using namespace std;

int main() {
    int rows = 5;
    cout << "Enter the number of rows: ";
    cin >> rows;
    char ch;

    for (int i = 1; i <= rows; i++)
    {
        for(int k = rows; k>i; k--){
            cout << " ";
        }
        
        for (int j = 1; j <= i; j++) {  
            ch ='A';
            
            if(i!=j){
                ch =ch+(i-j);
                cout << ch;
            }
            
            if(i==j){
                cout << "A";
            }
            
        }
        cout << endl;
    }

    return 0;
}

/*

output -:

Enter the number of rows: 5

    A
   BA
  CBA
 DCBA
EDCBA

*/
