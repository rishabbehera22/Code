#include <iostream>
using namespace std;
template<class t1,class t2>
void Swap(t1 &a,t2 &b)
{
    cout<<"sum is ="<<a+b<<endl;
}
int main()
{
    int y;
    float x;
    cout<<"enter 2 numbers";
    cin>>x>>y;
    Swap(x,y);
}