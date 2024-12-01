#include<iostream>
using namespace std;

class Addition {
    public:
    int number1, number2, sum;

    Addition(int num1, int num2) {
        number1 = num1;
        number2 = num2;
        sum = number1 + number2;
    }
    
    // Copy constructor
    Addition(Addition add) {
        number1 = add.number1;
        number2 = add.number2;
        sum = add.sum;
    }
    // to display the sum
    void display() {
        cout << "The sum is: " << sum << endl;
    }
};

int main() {
    // parameterised constructor
    Addition addition1(15,25);
    addition1.display();
    
    // Creating the second object using the copy constructor
    Addition addition2 = addition1;
    addition2.display();  

    return 0;
}

