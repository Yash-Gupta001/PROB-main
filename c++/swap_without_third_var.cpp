#include <iostream>
using namespace std;

int main() {
    int a = 10;
    int b = 20;
    cout << "before swap" <<endl;
    cout <<"a= "<< a <<endl;
    cout <<"b= "<< b <<endl;
    
    a = a+b; //30
    b = a-b; //10
    a = a-b; //20
    cout << "after swap" <<endl;
    cout <<"a= "<< a <<endl;
    cout <<"b= "<< b <<endl;
}
