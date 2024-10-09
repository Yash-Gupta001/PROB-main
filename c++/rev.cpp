#include <iostream>
#include <conio.h>
#include <string.h>
using namespace std;
class Sample
{
public:
    char arr[20];

    void getData()
    {
        cout << "enter array";
        cout << endl;
        cin.get(arr, 100);
    }

    void logic()
    {
        int i = 0;
        char arr1[20];
        int j = 0;
        int count = 0;

        while (arr[i] != '\0')
        {

            if (arr[i] >= 'A' && arr[i] <= 'Z' || arr[i] >= 'a' && arr[i] <= 'z')
            {
                arr1[j] = arr[i];

                count++;
            }

            else if (arr[i] == ' ')
            {

                for (int k = count - 1; k >= 0; k--)
                {
                    cout << arr1[k];
                }
                cout << endl;
                j = 0;
                count = 0;
            }
            i++;
            j++;
        }
        for (int l = strlen(arr1) - 1; l >= 0; l--)
        {
            cout << arr1[l];
        }
    }
};

int main()
{
    Sample s;
    s.getData();
    s.logic();
    return 0;
}