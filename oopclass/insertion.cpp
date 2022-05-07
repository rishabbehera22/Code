#include <iostream>
using namespace std;
int main()
{
    int n,j,i,key;
    cout<<"enter the size of the array";
    cin>>n;
    int a[n];
    for(i=0;i<n;i++)
    {
        cin>>a[i];
    }
    for (i = 1; i < n; i++)
    {
        key = a[i];
        j = i - 1;
        while(j>=0 && a[j]>key)
        {
            a[j+1]=a[j];
            j=j-1;
        }
        a[j+1]=key;
    }
    for(i=0;i<n;i++)
    {
        cout<<a[i]<<" ";
    }
}