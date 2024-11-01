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
    
    void Input(){
        cin.ignore();
            cout << "Enter employee name: ";
            getline(cin, name);

            cout << "Enter employee post: ";
            getline(cin, post);

            cout << "Enter employee ID: ";
            cin >> emp_id;

            cout << "Enter gender (m/f): ";
            cin >> gen;

            cout << "Enter salary: ";
            cin >> sal;

            cout << "Enter employee DOB : ";
            cin >> dob;
    }
    
    void inputDetails() {
        int interate;
        do {
            cout << "Enter 0 to continue or 1 to end: ";
            cin >> interate;
            switch (interate) {
                case 0: {
                    Input();
                    Details();
                    break; 
                }
                case 1: {
                     interate = 1;
                    break;
                }
                default: {
                    cout << "Invalid choice" << endl;
                    
                    break;
                }
            }
        } while (interate != 1);
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
    Employee emp;
    emp.inputDetails();

    return 0;
}
