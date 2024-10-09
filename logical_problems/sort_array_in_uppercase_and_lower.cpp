#include <iostream>
#include <string>

using namespace std;

int main() {
    string input;

    // Prompt the user for input
    cout << "Enter a string with both uppercase and lowercase letters: ";
    getline(cin, input);

    cout << "Output: ";
    for (size_t i = 0; i < input.length(); ++i) {
        if (i % 2 == 0) {
            // Even position (0-based index), print uppercase letters
            if (isupper(input[i])) {
                cout << input[i];
            }
        } else {
            // Odd position, print lowercase letters
            if (islower(input[i])) {
                cout << input[i];
            }
        }
    }

    cout << endl;

    return 0;
}
