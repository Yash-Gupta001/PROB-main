#include <iostream> 
using namespace std; 
  
int main() 
{ 
    int len,n = 0; 
    cout << "enter lenght of value to be added-:";
    cin >> len;
    int val[len]; 

    for (int i = 0; i < len; i++) { 
        cout << "Enter a number: "; 
        cin >> val[i]; 
    } 
  
    cout << "addition-: "; 
    for (int i = len-1; i >= 0; i--) { 
        //cout << val[i] << ", "; 
        n = n+val[i];
    } 
    cout << n;
    return 0; 
}