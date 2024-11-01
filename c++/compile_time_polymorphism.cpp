// compile time polymorphism

#include<iostream>
using namespace std;

// polymorphism poly means many & morphism mean form
// runtime and compile time polymorphism
// compile time polymorphism -: decision taking at runtime --> overloading functiion
// runtime polymorphism -: decision taking at runtime

class CalEmpsalary{
    public:
    int eid;
    string ename;
    CalEmpsalary(int id,string name){
        eid = id;
        ename = name;
    }

    void salary(float basic, float hra, float pf,float pt){
        float total_salary = ((basic+hra)-(pf+pt));
        cout << "Employee Name -: " << endl;
        cout << "Employee salary -: "<< endl;
    }

    void salary(float basic, float hra, float pf,float pt,float bonus){
        float total_salary = ((basic+hra+bonus)-(pf+pt));
        cout << "Employee Name -: " << endl;
        cout << "Employee salary -: "<< endl;
    }
    
};

int main(){
    CalEmpsalary emp1(101,"amit");
    emp1.salary(70000,5122,869,589);

    CalEmpsalary emp1(987,"ram");
    emp1.salary(70000,5122,869,589,5214);


}