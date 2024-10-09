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
        cout << "multiplication of two variable " << a * b<<endl;
    }
};

class C  :public A,public B{
    public:
    int c = 80;
    void sub(){
        cout << "subraction of variable " << c - B::b << endl;
    }

    void div(){
        cout << "division of variable " << c / B::b << endl;
    }
};

class D : public C{
    public:
    void print(){
        cout << "inheritance value derived from class C " << c << endl;
    }
};

// hybrid 

int main(){
    D b;
    b.add();
    b.mul();
    b.sub();
    b.div();
    b.print();
    
}
