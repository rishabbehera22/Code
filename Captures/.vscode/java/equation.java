import java.util.Scanner;

class equation{
    public static void main(String[] args) {
        Scanner sc = new 
        Scanner(System.in);
        System.out.println("Enter the coefficents");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int o=sc.nextInt();
        calculation c=new calculation();
        c.setcoefficents(n,m,o);
        c.findRoots();
    }
}

class calculation {
    int a,b,c;
     void setcoefficents(int num1,int num2,int num3)
    {
        a=num1;
        b=num2;
        c=num3;
    }
    void findRoots()
    {
       float r1=((-1*b)+((b*b)-(4*a*c)))/(2*a);
       float r2=((-1*b)-((b*b)-(4*a*c)))/(2*a);
       System.out.println("the roots are:");
       System.out.println(r1);
       System.out.println(r2);
    }
}
