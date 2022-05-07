#include <iostream>
using namespace std;
template<class g,class y>
class sum
{
    y s;
    public:
     sum(g a,y b)
    {
        s=a+b;
    }
    void display()
    {
        cout<<"the sum is "<<s;
    }
};
int main()
{
    int a;
    float b;
    cout<<"enter the numbers"<<endl;
    cin>>a;
    cin>>b;
    sum<int,float> ex(a,b);
    ex.display();
}