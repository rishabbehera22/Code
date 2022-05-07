#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int n,m,i,j;
int all[10][10],max_527 [10][10],need_527[10][10];
int avail_51527[10],work_527[10],req_527[10];
struct process
{
 char name[10];
 int flag;
}p[10];
 
void input()
{
 printf("enter the total number of process \n");
 scanf("%d",&n);
 for(i=0;i<n;i++)
 {
  printf("name:");
  scanf("%s",p[i].name);
  }
  printf(" enter the number of resouces \n");
  scanf("%d",&m);
  printf(" enter the allocation matrix \n");
  for(i=0;i<n;++i)
  {
   for(j=0;j<m;++j)
   scanf("%d",&all[i][j]);
  }
  printf(" enter max_527 matrix \n");
  for(i=0;i<n;++i)
  {
   for(j=0;j<m;++j)
   scanf("%d",&max_527[i][j]);
  }
  printf(" need_527 matrix \n");
  for(i=0;i<n;++i)
   {
    for(j=0;j<m;++j)
    {
     need_527[i][j]=max_527[i][j]-all[i][j];
     printf(" %d ",need_527[i][j]);
      printf("\n");
     }
   }
     printf("\n");
     printf("enter avaliable resources \n");
     for(i=0;i<m;i++)
      scanf("%d",&avail_51527[i]);
}
void safeseq()
{
  int sseq[10],ss=0,chk=0,chki=0,count=0;
  for(j=0;j<m;++j)
   work_527[j]=avail_51527[j];
   for(i=0;i<n;++i)
    p[i].flag=0;
    while(count!=5)
    {
     for(i=0;i<n;++i)
     {
      chk=0;
      for(j=0;j<m;++j)
      {
       if(p[i].flag==0)
       {
        if(need_527[i][j]<=work_527[j]);
        chk++;
        }
        if(chk==m)
        {
         for(j=0;j<m;j++)
         {
          work_527[j]=work_527[j]+all[i][j];
          printf("%d",work_527[j]);
          p[i].flag=1;
         }
        sseq[ss]=1;
        ss++;
        count++;
      }
     }
    }
   }
  for(i=0;i<n;++i)
  {
   if(p[i].flag==1)
   chki++;
   }
   if(chki>=n)
   {
    printf("system is in safe state \n");
    for(i=0;i<n;++i)
     printf(" %d ",sseq[i]);
    }
    else
    printf("not safe \n");
}
void req_527uest()
{
 int pro;
 printf(" enter the process number of req_527uest \n");
 scanf("%d",&pro);
 printf(" enetr the req_527uest array \n");
 for(i=0;i<m;++i);
 scanf("%d",&req_527[i]);  
 for(j=0;j<m;j++)
 {
  if(req_527[j]<=need_527[pro][j])
  {
   if(req_527[j]<=avail_51527[j])
   {
    avail_51527[j]=avail_51527[j]-req_527[j];
    all[pro][j]=all[pro][j]+req_527[j];
    need_527[pro][j]=need_527[pro][j]-req_527[j];
    printf(" avail_51527: %d",avail_51527[j]);
   }
  printf("\t need_527 : %d",need_527[pro][j]);
 }
  else
  {
   printf("process has some kirik \n");
   exit(0);
  }
 }
}
void print()
{
 printf("max_527 matrix \n");
  for(i=0;i<n;++i)
  {
   for(j=0;j<m;++j)
   printf(" %d ",max_527[i][j]);
    printf("\n");
   }
   printf("allocation matrix \n");
  for(i=0;i<n;++i)
  {
   for(j=0;j<m;++j)
   printf(" %d ",all[i][j]);
    printf("\n");
   }
   printf("need_527 matrix \n");
  for(i=0;i<n;++i)
  {
   for(j=0;j<m;++j)
   printf(" %d ",need_527[i][j]);
    printf("\n");
   }
  printf(" \n avail_51527iable ");
  for(i=0;i<m;++i)
  printf(" %d ",avail_51527[i]);
}
int main()
{
 int ch;
 do{
 printf("\n menu");
 printf(" 1.input ");
 printf("\n 2.safe seq ");
 printf(" \n 3. request ");
 printf("\n 4.print");
 printf("\n 5.exit");
 printf("\n enter choice ");
 scanf("%d",&ch);
 switch(ch)
 {
  case 1: input();
   break;
  case 2: safeseq();
   break;
   case 3: req_527uest();
   break;
   case 4: print();
    break;
    case 5:break;
  }
  }while(ch!=5);
return 0;
}