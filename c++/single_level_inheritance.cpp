#include<iostream>
using namespace std;

class A{
    public:
    int b= 5, a = 10;

    void add(){
        cout << "addition of two variable" << a+b<<endl
    }

};

class B :public A{
    public:
    void mul(){
        cout << "addition of two variable" << a*b<<endl
    }
};

int main(){
    B b;
    b.add;
    b.mul;
}















// sw