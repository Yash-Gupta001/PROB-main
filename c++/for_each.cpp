#include <iostream>
using namespace std;

int main(){
    int n;
    cin >> n;
    int arr[n] ={} ;

    for (int i = 0; i < n; i++) { 
        cout << "Enter a number: "; 
        cin >> arr[i]; 
    } 

//     In C++, the for-each loop, also known as the range-based for loop, provides a more concise and readable way to iterate over elements in a container like arrays, vectors, lists, etc.

// Syntax:

// for (declaration : container) {
//      code to be executed
// }

// declaration: A variable that holds each element of the container during the iteration.
// container: The collection or array that you want to iterate over

    for(int i : arr){
        cout <<"value-:"<< i << endl;
    }
}