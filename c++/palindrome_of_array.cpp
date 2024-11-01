#include <iostream>
using namespace std;

int main() {
    int n , flag = 0;
    cout << "Enter the number of elements-: ";
    cin >> n;

    int arr[n];
    cout << "Enter the elements in the array: ";

    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    for (int i = 0; i < n; i++) {  
        if(arr[i] != arr[n-i-1]){
            flag = 1;
            break;
        }
    }
    
    if(flag == 0){
            cout << "number is palindrome" << endl;
        }
        
        else{
            cout << "not a palindrome number" << endl;
        }

    return 0;
}
