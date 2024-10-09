#include <iostream>
#include <string>
using namespace std;

class Employee {
public:
    string name;
    string emp_id;
    string post;
    char gen;
    int sal;
    int dob;
     
    // Parameterised constructor
    Employee(string name, string emp_id, string post, char gen, int sal, int dob) {
        this->name = name;
        this->emp_id = emp_id;
        this->post = post;
        this->gen = gen;
        this->sal = sal;
        this->dob = dob;
    }

    // Default constructor
    Employee() {
        // cout << "default constructor";
        name = "amit";
        emp_id = "101";
        post = "frontend developer";
        gen = 'm';
        sal = 30000;
        dob = 17112001;
    }
    
    void Details() {
        cout << "\nEmployee Details -:\n";
        cout << "Employee ID -: " << emp_id << endl;
        cout << "Employee Name: " << name << endl;

        if (gen == 'm' || gen == 'f') {
            cout << "Gender -: " << gen << endl;
        } 
        else {
            cout << "Invalid gender input" << endl;
        }
        cout << "Employee Salary -: " << sal << endl;
        cout << "Employee Post -: " << post << endl;
        cout << "Employee DOB -: " << dob << endl;
    }
};

int main() {
    string name;
    string emp_id;
    string post;
    char gen;
    int sal;
    int dob;
    // (string name, string emp_id, string post, char gen, int sal, int dob)
    
    int repeat;
    do{
        
        cout<<"enter 0 to continue else 1"<<endl;
        cin>>repeat;
        
        if(repeat==0){
            cout << "enter name-: " << endl;
            cin >> name;
    
            cout << "enter id-: " << endl;
            cin >> emp_id;
    
            cout << "enter post-: " << endl;
            cin >> post;
    
            cout << "enter gender-: " << endl;
            cin >> gen;
    
            cout << "enter sal-: " << endl;
            cin >> sal;
    
            cout << "enter DOB-: " << endl;
            cin >> dob;
            Employee emp1(name,emp_id,post,gen,sal,dob);
            emp1.Details();
        }
        else if(repeat==1)
        {
            repeat=1;
        }
        
    }while(repeat!=1);
    
    
    
    Employee emp2("Rose", "102", "developer", 'f', 75000, 12032002);
    Employee emp3;

    emp2.Details();
    
    emp3.Details();
    return 0;
}
