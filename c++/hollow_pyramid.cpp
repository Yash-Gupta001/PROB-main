#include <iostream>
using namespace std;

int main() {
    int rows;
    cout << "Enter the number of rows: ";
    cin >> rows;

    for (int i = 1; i <= rows; i++) {
        for(int k = rows; k >= i;k--){
                cout << " ";
            }
        for (int j = 1; j <= i; j++) {
            if(i==j || j==1 ||i == rows){
                cout << "* ";
            }
            else{
                cout << "  ";
            }
        }
        cout << endl;
    }

    return 0;
}
