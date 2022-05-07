#include<stdio.h>
struct time
{
    int Arrival,Waiting,Turnaround,Burst;
};
struct time b[10];
int main()
{
    int n;
    printf("Enter number of process\n");
    scanf("%d",&n);
    int total=0;
    printf("Enter the times ");
    int i;
    for(i=0;i<n;i++)
    {
        printf("Enter the time of %d",i);
        scanf("%d%d",&b[i].Arrival,&b[i].Burst);
    }
    b[i].Waiting=0;
    for(i=1;i<n;i++)
    {
        b[i].Waiting=b[i-1].Burst+b[i-1].Waiting;
        total=total+b[i].Waiting;
    }
    float avgw=total/n;
    total=0;
    for(i=0;i<n;i++)
    {
        b[i].Turnaround=b[i].Burst+b[i].Waiting;
        total=total+b[i].Turnaround;
    }
    float avgt=total/n;
    printf("Process ,  Waiting_time ,  TurnA_time , Arrival , Burst\n");
    for(int i=0;i<n;i++)
    {
        printf("%d\t\t%d\t\t%d\t%d\t%d\n",i+1,b[i].Waiting,b[i].Turnaround,b[i].Arrival,b[i].Burst);
    }
    printf("Average waiting time is : %f\n",avgw);
    printf("Average turn around time is : %f\n",avgt);
}