#include <stdio.h>
#include <limits.h>
#include <stdbool.h>
#include <stdlib.h>

struct process_struct
{  
    int at;
    int bt;
} ps[100];
int main()
{
      int i, limit, total = 0, x, counter = 0, time_quantum;
      int wait_time = 0, turnaround_time = 0,  temp[10];
      float average_wait_time, average_turnaround_time;
      printf("nEnter Total Number of Processes:t");
      scanf("%d", &limit);
      x = limit;
      for(i = 0; i < limit; i++)
      {
            printf("nEnter Details of Process[%d]n", i + 1);
 
            printf("Arrival Time:t");
 
            scanf("%d", &ps[i].at);
 
            printf("Burst Time:t");
 
            scanf("%d", &ps[i].bt);
 
            temp[i] = ps[i].bt;
      }
 
      printf("nEnter Time Quantum:t");
      scanf("%d", &time_quantum);
      printf("nProcess IDttBurst Timet Turnaround Timet Waiting Timen");
      for(total = 0, i = 0; x != 0;)
      {
            if(temp[i] <= time_quantum && temp[i] > 0)
            {
                  total = total + temp[i];
                  temp[i] = 0;
                  counter = 1;
            }
            else if(temp[i] > 0)
            {
                  temp[i] = temp[i] - time_quantum;
                  total = total + time_quantum;
            }
            if(temp[i] == 0 && counter == 1)
            {
                  x--;
                  printf("nProcess[%d]tt%dtt %dttt %d", i + 1, ps[i].bt, total - ps[i].at, total - ps[i].at- ps[i].bt);
                  wait_time = wait_time + total - ps[i].at - ps[i].bt;
                  turnaround_time = turnaround_time + total - ps[i].at;
                  counter = 0;
            }
            if(i == limit - 1)
            {
                  i = 0;
            }
            else if(ps[i + 1].at <= total)
            {
                  i++;
            }
            else
            {
                  i = 0;
            }
      }
 
      average_wait_time = wait_time * 1.0 / limit;
      average_turnaround_time = turnaround_time * 1.0 / limit;
      printf("nnAverage Waiting Time:t%f", average_wait_time);
      printf("nAvg Turnaround Time:t%fn", average_turnaround_time);
      return 0;
}