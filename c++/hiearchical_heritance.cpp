#include<iostream>
using namespace std;

class A{
    public:
    int a = 20, b = 30;
    void add(){
        cout << "addition of two variable " << a+b<<endl;
    }
};

class B: public A{
    public:
    void mul(){
        cout << "multiply of two variable " << a*b<<endl;
    }
};

class C: public A{
    public:
    void div(){
        cout << "division of two variable " << a/b<<endl;
    }
};

class D: public A{
    public:
    void sub(){
        cout << "subraction of two variable " << a - b<<endl;
    }
};

int main(){
    B b;
    C c;
    D d;
    b.mul();
    c.div();
    d.sub();
    d.add();
}
