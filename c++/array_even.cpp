#include <iostream> 
using namespace std; 

int main()
{ 
    int len; 
    cout << "enter lenght of value to be added-:";
    cin >> len;
    int val[len]; 

    for (int i = 0; i < len; i++) { 
        cout << "Enter a number: "; 
        cin >> val[i]; 
    } 
  
    cout << "element-: "; 
    for (int i = 0; i < len; i++) { 
        //cout << val[i] << ", "; 
        if(val[i] % 2 !=1){
            cout << "even no-: "<<val[i] << ", ";
        }
    } 
    return 0; 
}
