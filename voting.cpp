#include <iostream>

using namespace std;

int main()
{
    int age;
    cout<<"\t\tELIGIBLITY CHECK";
    cout<<"\nEnter your Age :";
    cin>>age;
    if(age>=18)
    cout<<"Eligible to Vote!";
    else
    {
    cout<<"Not eligible to Vote!";
    cout<<"\n Wait for "<<18-age<<" years.";
    }
    return 0;
}
