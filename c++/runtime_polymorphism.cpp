#include<iostream>
using nameswpace std;

// overiding -: same name of function with same paramater in a differeent class called as function overriding

class OldBank{
    public:
    void transaction(){
        cout << "old method"<<endl; 
    }
};

class NewBank : public OldBank{
    public:
    void transaction(){
        cout << "New method"<< endl;
    }
};

int main(){
    NewBank nb;
    nb.transaction();
}

// sw