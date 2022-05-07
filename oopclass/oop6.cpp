#include <iostream>
using namespace std;

int main()
{
    int eno, esal;
    char ename[10];
    cout << "Enter Employee details: ";
    cin >> eno >> esal;
    cout<<"enter the name";
    cin>>ename;
    try
    {
        if (esal <= 0)
            throw (esal);

        else
        {
            int hra = esal * 15 / 100;
            int ta = esal * 9 / 100;
            int gross = esal + hra * ta;
            cout <<"Employee No:" << eno << endl;
            cout <<"Employee Name" << ename << endl;
            cout <<"Employee Gross Salary" << gross << endl;
        }
    }
    catch (int j)
    {
        cout <<"invalid salary"<<j;
    }
}