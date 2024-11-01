// hiding unnecessary data and implementation and showing necessary data implementation 

#include<iostream>
using namespace std;

class Para{
    public:
    int base;
    int height;

    void setData(int b,int h){
        base = b;
        height = h;
    }

    virtual void area() = 0;  //
};

class triangle: public Para{

    void area(){
        cout << "area of triangle" << 0.5*base * height<<endl;
    }

};

class Rectangle: public Para{

    void area(){
        cout << "area of rectangle" << base * height<<endl;
    }

};

int main(){
    triangle t(8,9);
    t.area();

    Rectangle r(10,20);
    r.area();
}

// sw