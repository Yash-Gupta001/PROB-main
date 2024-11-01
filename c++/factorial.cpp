#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter a number: ";
    cin >> n;

    int res = 1; 
    for (int i = 1; i <= n; i++) {
        res *= i; 
    }

    cout << "Factorial of " << n << " is: " << res << endl;
    return 0;
}


