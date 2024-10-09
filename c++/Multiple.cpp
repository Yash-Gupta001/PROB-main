#include<iostream>
using namespace std;

class A{
    public:
    int a = 20, b = 30;
    void add(){
        cout << "addition of two variable " << a+b<<endl;
    }
};

class B{
    public:
    int a=5,b=10;
    void mul(){
        cout << "addition of two variable " << a * b<<endl;
    }
};

class C  :public A,public B{
    public:
    int c = 80;
    void sub(){
        cout << "subraction of variable " << c - B::b << endl;
    }

    void div(){
        cout << "subraction of variable " << c / B::b << endl;
    }
};

int main(){
    C b;
    b.add();
    b.mul();
    b.sub();
    b.div();
}
