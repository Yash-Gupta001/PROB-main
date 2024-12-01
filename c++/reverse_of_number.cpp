#include <iostream>
using namespace std;

int reverseInt(int num) {
    int reverse = 0;
    int check = num;
// check reverse
    while (num != 0) {
        int digit = num % 10;              // Extract the last digit
        reverse = reverse * 10 + digit;    // Append the digit to the reversed number
        num /= 10;                         // Remove the last digit from the original number
    }

    // Check if the number is a palindrome
    if (check == reverse) {
        cout << "It is a palindrome." << endl;
    } 
    else {
        cout << "Not a palindrome." << endl;
    }
    
    cout << "Reverse of the number: " << reverse << endl;

    return reverse;
}

int main() {
    int num = 12345;  // Example number
    int reversedNum = reverseInt(num);
    

    return 0;
}
