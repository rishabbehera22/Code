#include<iostream>
using namespace std;
int main()
{
    int i,n,q,s=0;
    cout<<"enter the total numbers";
    cin>>n;
    int a[n];
    for(i=0;i<n+2;i++)
    {
        cin>>a[i];
    }
    for(i=0;i<n;i++)
    { 
        q=a[i];
        for(i=0;i<n+2;i++)]\
        {
            if(q==a[i])
            {
                s=s+1;
            }
        }
        if(s=2)
        {
            cout<<"frequency is greater then one ="<<q;
        }
        s=0;
    }
}