#include <iostream>
using namespace std;


int main() {
    char op;
    float  num2, num1;

    cout << "Enter value"<<endl;
    cin >> num1,num2;

    switch (op) {
        case '+':
        cout <<"enter height";
            cout <<"Addition "<< num1+num2 << endl;
            break;

        case '*':
        cout <<"multiplication";
            cout <<"multiplication " << num1*num2 << endl;
            break;

        case '-':
        cout <<"subraction";
            cout << "subraction" << num1 - num2 << endl;
            break;

        case '/':
        cout <<"div";
            cout << "div" << num/num2 << endl;
            break;
        default:
            cout << "not correct." << endl;
            break;
    }
    return 0;
}
