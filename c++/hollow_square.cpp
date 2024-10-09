#include <iostream>
using namespace std;

int main() {
    int rows;
    cout << "Enter the number of rows: ";
    cin >> rows;

    for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= rows; j++) {
            if(i==1 || j==1 || j == rows || i == rows){
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



// #include <iostream>
// using namespace std;

// int main() {
//     int rows = 5; // Change this value to adjust the height of the pyramid
    
//     for (int i = 1; i <= rows; i++) {
//         for (int j = i; j < rows; j++) {
//             cout << " ";
//         }

//         for (int j = 1; j <= 2 * i - 1; j++) {
//             if (j == 1 || j == 2 * i - 1 || i == rows) {
//                 cout << "*";
//             } else {
//                 cout << " ";
//             }
//         }
//         cout << endl;
//     }

//     return 0;
// }
