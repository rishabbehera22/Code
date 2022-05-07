#include<stdio.h>
int main()
{
    int a[10],b[10],x[10];
    int waiting[10],turnaround[10],completion[10];
    int i,j,smallest,count=0,time,n;
    double avg=0,tt=0,end;

    cout<<"\nEnter the number of Processes: ";  //input
    cin>>n;
    for(i=0; i<n; i++)
    {
        cout<<"\nEnter arrival time of process: ";  //input
        cin>>a[i];
    }
    for(i=0; i<n; i++)
    {
        cout<<"\nEnter burst time of process: ";  //input
        cin>>b[i];
    }
    for(i=0; i<n; i++)
        x[i]=b[i];