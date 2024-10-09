#include <iostream> 
using namespace std;

bool Prime(int n) {
    if (n <= 1) 
        return false;
    
    if (n==2 || n==3)
        return true;
      
    if (n % 2 == 0 || n % 3 == 0)
        return false;
    
    for (int i = 5; i * i <= n; i += 6) {
        if (n % i == 0 || n % (i + 2) == 0)
            return false;
    }
    
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


