#include <iostream> 
using namespace std;

bool Prime(int n) {
    if (n <= 1) {
        return false;
    }
    for (int i = 2; i <= n / 2; i++) {  
        if (n % i == 0) {  
            return false;  
        }
    }
    return true;  
}

int main() { 
    int len; 
    cout << "Number of elements to add: ";
    cin >> len;
    int val[len]; 

    for (int i = 0; i < len; i++) { 
        cout << "Enter a number: "; 
        cin >> val[i]; 
    } 
  
    cout << "Prime numbers: ";
    for (int i = 0; i < len; i++) { 
        if (Prime(val[i])) {
            cout << val[i] << " ";
        }
    } 
    cout << endl;
    return 0; 
}
