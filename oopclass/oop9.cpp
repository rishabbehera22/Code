#include <iostream>
using namespace std;
template<class g>
void Swap(g &a,g &b)
{
    cout<<"sum is ="<<a+b<<endl;
}
int main()
{
    int x,y;
    cout<<"enter 2 numbers";
    cin>>x>>y;
    Swap(x,y);
}