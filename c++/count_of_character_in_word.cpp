#include <iostream>
#include <string>
using namespace std;

int main() {
    string sen;
    cout << "Enter a sentence: ";
    getline(cin, sen);

    int count = 0;

    for (char ch : sen) {
        if (ch != ' ') {
            count++;
        } 
        else {
            if(count > 0){
                cout << "length: " << count << "\n";
                count = 0;
            }
        }
    }
    

    return 0;
}
