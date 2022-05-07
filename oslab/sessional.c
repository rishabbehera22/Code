#include <stdio.h>
struct process
{
    int WT, AT, BT, TAT, PT;
};

struct process a[10];

int main()
{
    int n, temp[10], t, ct = 0, sp;
    float twt = 0, ttat = 0, awt, atat;
    printf("Enter the number of the process\n");
    scanf("%d", &n);
    printf("Enter the arrival time , burst time and priority of the process\n");
    printf("AT BT PT\n");
    for (int i = 0; i < n; i++)
    {
        scanf("%d%d%d", &a[i].AT, &a[i].BT, &a[i].PT);

        temp[i] = a[i].BT;
    }
    a[9].PT = 10000;
    for (t = 0; ct != n; t++)
    {
        sp = 9;
        for (int i = 0; i < n; i++)
        {
            if (a[sp].PT > a[i].PT && a[i].AT <= t && a[i].BT > 0)
            {
                sp = i;
            }
        }

        a[sp].BT = a[sp].BT - 1;

        if (a[sp].BT == 0)
        {

            ct++;
            a[sp].WT = t + 1 - a[sp].AT - temp[sp];
            a[sp].TAT = t + 1 - a[sp].AT;

            twt = twt + a[sp].WT;
            ttat = ttat + a[sp].TAT;
        }
    }

    awt = twt / n;
    atat = ttat / n;

    printf("ID\tAT\tWT\tTAT\tPR \n");
    for (int i = 0; i < n; i++)
    {
        printf("%d\t%d\t%d\t%d\t%d\n", i + 1, a[i].AT, a[i].WT, a[i].TAT, a[i].PT);
    }

    printf("Avg waiting time of the process  is %f\n", awt);
    printf("Avg turn around time of the process is %f\n", atat);

    return 0;
}