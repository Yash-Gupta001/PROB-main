#include <iostream>
using namespace std;

int main() {
    int age;
    cout <<"Enter your age-: "<< endl;

    cin >> age;
    if (age >= 18){
        cout << "You are eligible to vote";
    }
    else{
        cout << "you are underage"<<endl;
    }
    if (age < 18){
    cout << "you need to wait for "<< 18 - age << " more years to vote";
    }
    
}
