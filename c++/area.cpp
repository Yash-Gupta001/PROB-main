#include <iostream>
using namespace std;

int main() {
    char op;
    float r, num2, num1, l;

    cout << "Enter an 1 for area of square"<<endl;
    cout << "Enter an 2 for area of circle"<<endl;
    cout << "Enter an 3 for area of rectangle"<<endl;
    cin >> op;

    switch (op) {
        case '1':
        cout <<"enter height";
        cin >> num1 >> num2;
            cout <<"Area of square is"<< 4*l << endl;
            break;

        case '2':
        cout <<"enter radius";
        cin >> r;
            cout <<"Area of circle is" << 2*3.14*r << endl;
            break;

        case '3':
        cout <<"enter height and idth";
        cin >> num1 >> num2;
            cout << "Area of rectangle" << num1 * num2 << endl;
            break;

        default:
            cout << "not correct." << endl;
            break;
    }

    return 0;
}
