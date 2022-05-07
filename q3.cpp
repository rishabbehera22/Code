#include<iostream>
using namespace std;
int main()
{
    int n, x;
    cout<<"Enter no. of elements";
    cin>>n;
    int a[n];
    int i = 0, j = n - 1;
    cout<<"Enter the elements: ";
    for (int i = 0; i < n; i++)
    {
        cin>>a[i];
    }
    while (j >= i)
    {
        if (a[i] % 2 != 0)
        {
            if (a[j] % 2 == 0)
            {
                x = a[i];
                a[i] = a[j];
                a[j] = x;
                i++;
                j--;
            }
            else
                j--;
        }
        else
            i++;
    }
    for (int i = 0; i < n; i++)
        cout<<a[i]<<endl;
}