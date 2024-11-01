#include <iostream>
using namespace std;

int calculatePower(int digit, int numDigits) {
    int result = 1;
    for (int i = 0; i < numDigits; i++) {
        result *= digit;
    }
    return result;
}

bool isArmstrong(int num) {
    int originalNum = num;
    int sum = 0;
    int numDigits = 0;

    // Count the number of digits
    int tempNum = num;
    while (tempNum > 0) {
        numDigits++;
        tempNum /= 10;
    }

    // Calculate the Armstrong value
    tempNum = num;  // Reset tempNum to original num
    while (tempNum > 0) {
        int digit = tempNum % 10;
        sum += calculatePower(digit, numDigits);
        tempNum /= 10;
    }

    // Check if the original number is equal to the calculated sum
    return (sum == originalNum);
}

int main() {
    int num = 1634;  // Example number

    if (isArmstrong(num)) {
        cout << num << " is an Armstrong number." << endl;
    } else {
        cout << num << " is not an Armstrong number." << endl;
    }

    return 0;
}
