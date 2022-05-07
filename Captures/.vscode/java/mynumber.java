import java.util.Scanner;

class mynumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        value v=new value();
        v.setValue(n);
        boolean j=v.isEven();
        System.out.println("the number is even ?");
        System.out.println(j);
        int q=v.findfactorial();
        System.out.println("the factorial is :");
        System.out.println(q);
        boolean z=v.isPrime();
        System.out.println("the number is prime?");
        System.out.println(z);
        int y=v.findsumOFDIGITS();
        System.out.println("sum of digits");
        System.out.println(y);
    }
}
class value {
    int number;
     void setValue(int num1)
    {
        number=num1;
    }
    boolean isEven()
    {
        if(number%2==0)
        {
            return true;
        }
        else
        {
        return false;
        }
    }
    int findfactorial()
    {
        int i;
        int p=1;
        for(i=1;i<=number;i++)
        {
            p=p*i;
        }
        return p;
    }
    boolean isPrime()
    {
        int i;
        int sum=0;
        for(i=1;i<=number;i++)
        {
            if(number%i==0)
            {
                sum=sum+1;
            }
        }
        if(sum==2){
            return true;
        }
        else{
            return false;
        }
    }
    int findsumOFDIGITS()
    {
        int n=number;
        int sum=0;
        int p;
        while(n>0)
        {
            p=n%10;
            sum=sum+p;
            n=n/10;
        }
        return sum;
    }
}

