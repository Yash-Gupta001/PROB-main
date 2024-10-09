#include<iostream>
using namespace std;

class A{
    public:
    int b= 5, a = 10;
    void add(){
        cout << "addition of two variable " << a+b<<endl;
    }

};

class B : public A{
    public:
    int c = 89;
    void mul(){
        cout << "addition of two variable " << a*b<<endl;
    }
};

class C  :public B{
    public:
    void sub(){
        cout << "subraction of variable " << c - b << endl;
    }
};

int main(){
    C b;
    b.add();
    b.mul();
    b.sub();
}
