#include <iostream>
#include <vector>

using namespace std;  // Namespace declaration

int main() { 
    // Demo vector
    vector<int> v = {1, 11, 22, 54, 71, 89};

    // It gives the size of the vector
    cout << "Size: " << v.size() << endl;

    // It gives the capacity of the vector
    cout << "Capacity: " << v.capacity() << endl;

    // Add an element to the vector from the end
    v.push_back(88);

    // Print the new size and capacity after adding an element
    cout << "New Size: " << v.size() << endl;
    cout << "New Capacity: " << v.capacity() << endl;

    // print the elements of the array
    for(int i  = 0; i < v.size();i++){
        cout << v[i] << endl;
    }

    // to remove last element fro array
    v.pop_back();
    cout << "After pop back function";

    for(int i  = 0; i < v.size();i++){
        cout << v[i] << endl;
    }


    return 0;
}
