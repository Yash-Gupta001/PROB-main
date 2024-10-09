#include <iostream>
using namespace std; 


int main() {
    int n;
    cin >> n;

    for (int i = 2; i <= n; i++) {  

        bool isPrime = true;  // Assume i is prime

        for (int j = 2; j <= i / 2; j++) {

            if (i % j == 0) {  
                isPrime = false;  // i is not prime
                break;
            }
        }
        
        if (isPrime) {
            cout << i << " ";  // Print the prime number
        }
    }

    return 0;
}
// sw