#include <iostream>
using namespace std;
int main()
{
    int n,j,i,temp,min,loc;
    cout<<"enter the size of the array";
    cin>>n;
    int a[n];
    for(i=0;i<n;i++)
    {
        cin>>a[i];
    }
    for(i=0;i<n-1;i++)
    {
        min=a[i];
        loc=i;
        for(j=i+1;j<=n-1;j++)
        {
            if(a[j]<min)
            {
                min=a[j];
                loc=j;
            }
        }
        if(loc!=i)
        {
            temp=a[loc];
            a[loc]=a[i];
            a[i]=temp;
        }
    }
    for(i=0;i<n;i++)
    {
        cout<<a[i]<<" ";
    }
}