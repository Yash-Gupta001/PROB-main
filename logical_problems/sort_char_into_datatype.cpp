#include<iostream>
using namespace std;

class Samp {
public:
    int vo_count = 0;
    int num_count = 0;
    int con_count = 0;
    int space_count = 0;
    
    char arr[100];

    void getData() {
        cout << "Enter a string: ";
        cin.get(arr, 100);
    }
    
    void logic() {
        int i = 0;
        while (arr[i] != '\0') {
            // if the character is a letter
            if ((arr[i] >= 'A' && arr[i] <= 'Z') || (arr[i] >= 'a' && arr[i] <= 'z')) {
                // Convert to lowercase 
                char lowerChar = tolower(arr[i]);

                // it is a vowel
                if (lowerChar == 'a' || lowerChar == 'e' || lowerChar == 'i' || lowerChar == 'o' || lowerChar == 'u') {
                    vo_count++;
                } else {  // If it is consonant
                    con_count++;
                }
            }
            // if the character is a digit
            else if (arr[i] >= '0' && arr[i] <= '9') {
                num_count++;
            }
            // if the character is a space
            else if (arr[i] == ' ') {
                space_count++;
            }
            
            i++;
        }

        cout << "Vowel count: " << vo_count << endl;
        cout << "Consonant count: " << con_count << endl;
        cout << "Number count: " << num_count << endl;
        cout << "Space count: " << space_count << endl;
    }
};

int main() {
    Samp s;
    s.getData();
    s.logic();
    return 0;
}
