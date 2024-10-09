#include <iostream>
#include <string>

using namespace std;

string Output(const string &input) {
    string result = "";
    char letter;
    for (size_t i = 0; i < input.length(); i++) {
        
        if (isalpha(input[i])) {
            letter = input[i]; 
            i++;
        }
        if (isdigit(input[i])) {
            int count = 0;
            
            while (i < input.length() && isdigit(input[i])) {
                count = count * 10 + (input[i] - '0'); 
                i++;
            }
            i--; 
            for (int j = 0; j < count; j++) {
                result += letter;
            }
            //result.append(count, letter);
        }
        
    }
    return result;
}

int main() {
    string input;
    cout << "enter char and after character repeat time character print-:" << endl; // for example-: a5b7c23
    cin >> input;
    string output = Output(input);
    cout << output << endl;  // Output: aaaaaaaaaabbbbb

    return 0;
}

/*
in this program we will print no. of characters followed by the written int value
for example-:
a3b2
output-:
aaabb
*/