#include <iostream>
#include <string>
using namespace std;

int main() {
	// Complete the program
    int counter = 0;
    string a,b;
    cin >> a >> b;
    
    string c = a + b;
    
    
    cout << a.size() <<" " << b.size() << endl;
    cout<< c << endl;
    char temp = b[0];
    b[0]=a[0];
    a[0] = temp;
    cout << a << " " << b << endl;
    
    
  
    return 0;
}

/*



Input (stdin)
abcd
ef

Your Output (stdout)
4 2
abcdef
ebcd af

Expected Output
4 2
abcdef
ebcd af

*/