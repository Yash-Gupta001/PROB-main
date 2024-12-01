#include <iostream>
using namespace std;

void performOperation(char op) 
{
    float num1, num2, r, l;

    switch (op) {
        case '1':
            cout << "Enter the side length of the square: ";
            cin >> l;
            cout << "Area of the square is: " << l * l << endl;
            break;

        case '2':
            cout << "Enter the radius of the circle: ";
            cin >> r;
            cout << "Area of the circle is: " << 3.14 * r * r << endl;
            break;

        case '3':
            cout << "Enter the length and width of the rectangle: ";
            cin >> num1 >> num2;
            cout << "Area of the rectangle is: " << num1 * num2 << endl;
            break;

        default:
            cout << "Invalid option." << endl;
            break;
    }
}

int main() {
    char op;
    char choice;

    do {
        cout << "Choose an option to calculate the area:" << endl;
        cout << "1. Area of a square" << endl;
        cout << "2. Area of a circle" << endl;
        cout << "3. Area of a rectangle" << endl;
        cin >> op;

        performOperation(op);

        cout << "Do you want to calculate another area? (y/n): ";
        cin >> choice;

    } while (choice == 'y' || choice == 'Y');

    return 0;
}
