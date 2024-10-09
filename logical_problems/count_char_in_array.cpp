#include<iostream>
using namespace std;
class Samp{
	public:
		int count=0;
		char arr[20];
		
		void getData()
		{
			cin.get(arr,100);
		}
		
		void logic()
		{
			int i=0;
			while(arr[i]!='\0')
			{
				if(arr[i]>='A' && arr[i]<='Z' ||
				arr[i]>='a' && arr[i]<='z'
				)
				{
					count++;
				}
				i++;
			}
			if(count%2==0){
			    cout << "the entered characters are even-: " << count;
			}
			else{
			    cout << "the entered characters are odd-: " << count;
			}
		//	cout<<count;
		}
};

int main()
{
	Samp s;
	s.getData();
	s.logic();
	return 0;
}