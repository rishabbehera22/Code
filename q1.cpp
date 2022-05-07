#include<iostream>
using namespace std;
int main()
{
    int i,n,s=0;
    cout<<"enter the total numbers";
    cin>>n;
    int a[n],b[n];
    cout<<"enter the numbers";
    for(i=0;i<n;i++)
    {
        cin>>a[i];
    }
    for(i=0;i<n;i++)
    {
        if(a[i]==0)
        {
           s=s+1;
        }
    }
    for(i=0;i<n;i++)
    {
        if(i<s)
        {
            a[i]=0;
        }
        else
        {
            a[i]=1;
        }
    }
    for(i=0;i<n;i++)
    {
        cout<<a[i]<<"  ";    
    }
}