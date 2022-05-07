#include <iostream>
using namespace std;
template<class g>
void Swap(g &a,g &b)
{
    g t;
    t=a;
    a=b;
    b=t;
}
int main()
{
    int x,y;
    cout<<"enter the 2 numbers";
    cin>>x>>y;
    Swap(x,y);
    cout<<"after swap the numbers are"<<endl;
    cout << "x value is:" << x<<endl;
    cout << "y value is:" << y<<endl;
}