#include<iostream>
using namespace std;
int main()
{
    int a,b;
    float p;
    cout<<"enter the 2 numbers";
    cin>>a>>b;
    try
    {
        if(b!=0)
        {
            p=a/b;
            cout<<"result is"<<p;
        }
        else
        {
            throw(b);
        }
    }
    catch(int j)
    {
        cout<<"answer is invalid because "<<j;
    }
}