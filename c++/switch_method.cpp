#include <iostream>
using namespace std;

void performOperation(char op, float num1, float num2) {
    switch (op) {
        case '+':
            cout << "Addition: " << num1 + num2 << endl;
            break;

        case '*':
            cout << "Multiplication: " << num1 * num2 << endl;
            break;
        
        case '-':
            cout << "Subtraction: " << num1 - num2 << endl;
            break;

        case '/':
            if (num2 != 0) {
                cout << "Division: " << num1 / num2 << endl;
            } 
            else {
                cout << "Error: Division by zero is not allowed." << endl;
            }
            break;
            
        default:
            cout << "Invalid operator." << endl;
            break;
    }
}

int main() {
    char op;
    float num1, num2;
    char choice;

    do {
        cout << "Enter first number: ";
        cin >> num1;
        cout << "Enter second number: ";
        cin >> num2;
        cout << "Enter operator (+, -, *, /): ";
        cin >> op;

        performOperation(op, num1, num2);

        cout << "continue? (y/n): ";
        cin >> choice;
    } while (choice == 'y' || choice == 'Y');

    return 0;
}
