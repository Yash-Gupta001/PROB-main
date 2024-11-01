#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter the number of elements-: ";
    cin >> n;

    int arr[n];
    cout << "Enter the elements in the array: ";
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    cout << "Prime numbers in the array: ";
    for (int i = 0; i < n; i++) {  
        int isPrime = 1;  
        for (int j = 2; j <= arr[i] / 2; j++) {
            if (arr[i] % j == 0) {  
                isPrime = 0;  
                break;
            }
        }

        if (isPrime) {  
            cout << arr[i] << " ";
        }
    }

    return 0;
}
