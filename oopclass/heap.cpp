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
    int largest=i;
    int l=2*i+1;
    int r=2*i+2;
    if (l < n && a[l] > a[largest])
    largest = l;
    if (r < n && arr[r] > arr[largest])
    largest = r;