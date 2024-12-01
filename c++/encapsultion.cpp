#include <iostream>
using namespace std;

class Employee {
    private:
    int eid;
    string ename;
    float esal;
    string eaddr;

    public:
    // Setter method to set data
    void setData(int id, string name, float sal, string addr) {
        eid = id;
        ename = name;
        esal = sal;
        eaddr = addr;
    }
    
    // getter to retrive data
    void getData() {
        cout << "Employee id -: " << eid << endl;
        cout << "Employee name -: " << ename << endl;
        cout << "Employee salary -: " << esal << endl;
        cout << "Employee address -: " << eaddr << endl;
    }
};

int main() {
    Employee e1;
    e1.setData(102, "Amit", 9000, "Nagpur");
    e1.getData(); 

    Employee e2;
    e2.setData(103, "Anil", 8000, "Mumbai"); 
    e2.getData();  

    return 0;
}
