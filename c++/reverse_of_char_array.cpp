#include <iostream>
#include <cstring>
using namespace std;

class Rev {
    public:
    char arr[30];

    void getData() {
        cout << "Enter array: " << endl;
        cin.get(arr, 30); 
    }

    void logic() {
        int len = arr.strlen(arr);
        for (int i = len - 1; i >= 0; i--) {
            cout << arr[i];
        }
        cout << endl; 
    }
    void prin(){
        cout << "prog end";
    }
};

int main() {
    Rev rev;       
    rev.getData(); 
    rev.logic();   
    rev.prin();
    return 0;
}
