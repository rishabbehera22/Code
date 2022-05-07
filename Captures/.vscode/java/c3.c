#include<stdio.h>
struct time
{
    int processid,Waiting,Turnaround,Burst;
};
struct time b[10];
int main()
{
    int n;int totalw=0;
    printf("Enter number of process\n");
    scanf("%d",&n);
    int total=0;
    printf("Enter the times ");
    int i;
    for(i=0;i<n;i++)
    {
        b[i].processid=i;
        printf("Enter the time of %d",i);
        scanf("%d",&b[i].Burst);
    }
    int j;int pos,temp;
    for(i=0;i<n-1;i++)
    {
        for(j=0;j<n-i-1;j++)
        {
            if(b[j+1].Burst<b[j].Burst)
            {
                temp=b[j+1].Burst;
                b[j+1].Burst=b[j].Burst;
                b[j].processid=temp;

                temp=b[j+1].processid;
                b[j+1].processid=b[j].processid;
                b[j].processid=temp;
            }
        }
    }
    b[0].Waiting=0;
    for(i=1;i<n;i++)
    {
        b[i].Waiting=0;
        for(j=0;j<i;j++){
            b[i].Waiting=b[i].Waiting+b[j].Burst;
        }
        totalw=totalw+b[i].Waiting;
    }
    float avg_wt=(float)totalw/n;
    int totalt=0;
    for(i=0;i<n;i++)
    {
        b[i].Turnaround=b[i].Waiting+b[i].Burst;
        totalt=totalt+b[i].Turnaround;
    }
    printf("nProcesst    Burst Time    tWaiting TimetTurnaround Time\n");
    for(i=0;i<n;i++)
    {
        printf("%d\t\t%d\t\t%d\t%d\n",b[i].processid,b[i].Burst,b[i].Waiting,b[i].Turnaround);
    }
    float avg_tat=(float)totalt/n;
    printf("nnAverage Waiting Time:%lfn", avg_wt);
      printf("Average Turnaround Time:%lfn", avg_tat);
}

