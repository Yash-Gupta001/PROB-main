#include <iostream>
#include <string>
using namespace std;

class Employee {
public:
int a,b;

 

void getData(){
    cout << "enter value of a"<<endl;
    cin >> a;
    cout << "enter value of b"<<endl;
    cin >> b;
    
    // cout << a << endl;
    // cout << b << endl;
}

    Employee(){   // default constructor
        a = 4;
        b = 5;
        cout << "default constructor" << endl;
    }
};

int main() {
    Employee emp;
    emp.getData();
    cout << emp.a << endl;
    cout << emp.b << endl;
    return 0;
}


/*
1) same name as class
2) no return type not even void
3) call at time of object creation
4) only used for object creation

types of constructor-:

1) Default constructor
2) Parameterised constructor
3) copy constructor
if we do not create a constructor a default constructor is already created i.e DEFAULT constructor

*/