#include <iostream> // Include necessary header

using namespace std; // Use the standard namespace

class Sample {
public:
    int age;
    string a;

    // Parameterized constructor
    Sample(string a, int age) {
        this->a = a;
        this->age = age;
    }

    // return the sum
    void sum() {
        cout << "your name -: "<< a <<endl;
        cout << "age-: " << age;
        // return (a + b);
    }
};

int main() {
    Sample s("amit", 4); // Parameterized constructor 
    // cout << s.sum() << endl; // Output 
    s.sum();
}
