#include <iostream>
using namespace std;

#define SIZE 10

template <class t1>
class stack
{
    t1 stk[SIZE];
    int top;

public:
    stack(int n)
    {
        top = -1;
    }

    int isFull()
    {
        if (top == (SIZE - 1))
            return 1;
        else
            return 0;
    }

    int push(t1 x)
    {
        if (isFull())
        {
            return 0;
        }
        ++top;
        stk[top] = x;
        return 1;
    }

    void display()
    {
        int i;
        cout << "STACK is: ";
        for (i = top; i >= 0; i--)
            cout << stk[i] << " ";
        cout << endl;
    }
};

int main()
{
    stack<int> s1(0);
    s1.push(1);
    s1.push(2);
    s1.push(3);
    s1.push(4);
    s1.display();

    stack<string> s2(5);
    s2.push("yes");
    s2.push("sir");
    s2.display();
}