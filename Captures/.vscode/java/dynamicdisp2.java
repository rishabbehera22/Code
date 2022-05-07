import java.util.Scanner;

public class dynamicdisp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        person[] p= new person[5];
        for(int i=1;i<=2;i++)
        {
            System.out.println("Enter details of employee number"  + i);
            System.out.println("ENTER ACCOUNT NUMBER");
            int acc_no=sc.nextInt();
            System.out.println("ENTER ADHAAR NUMBER");
            int adhaar_nos=sc.nextInt();
            System.out.println("ENTER BALANCE");
            int balance=sc.nextInt();
            System.out.println("ENTER NAME");
            sc.nextLine();
            String name=sc.nextLine();
            p[i]=new person(acc_no, balance, name, adhaar_nos);
        }
        for(int i=1;i<=2;i++)
        { 
            p[i].disp();
        }
    }
}
class Account{
    int acc_no;
    int balance;
    void disp()
    {
        System.out.println("The account number is" + acc_no);
        System.out.println("The balance is" + balance);
    }
}
class person extends Account{
    String name;
    int adhaar_nos;
    person(int a,int b,String n,int ad)
    {
        acc_no=a;
        balance=b;
        name=n;
        adhaar_nos=ad;
    }
    void disp()
    {
        System.out.println("The account number is" + acc_no);
        System.out.println("The balance is" + balance);
        System.out.println("The nam is:" + name);
        System.out.println("Adhaar number is:" + adhaar_nos);
    }
}
