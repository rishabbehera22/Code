import java.util.Scanner;

public class interface2 {
    public static void main(String[] args) {
        substaff s=new substaff();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter basic salary");
        int c=sc.nextInt();
        s.set(c);
        s.earnings();
        s.deductions();
        s.bonus();
    }
}
interface employee{
    void earnings();
    void deductions();
    void bonus();
}
abstract class Manager implements employee{
    int basic_salary;
    void set(int bs)
    {
        basic_salary=bs;
    }
    public void earnings()
    {
        System.out.println("Implementing earnings function");
        float income=(float)(basic_salary+(0.8*basic_salary)+(0.15*basic_salary));
        System.out.println("The earning is = " +income);
        System.err.println(" ");
    }
    public void deductions(){
        System.out.println("Implementing deduction function");
        float dedu=(float)(0.15*basic_salary);
        System.out.println("The deduction is = "  +dedu);
        System.err.println(" ");
    }
}
class substaff extends Manager implements employee
{
    public void bonus()
    {
        System.out.println("Implementing bonus through substaff");
        float b=(float)(0.5*basic_salary);
        System.out.println("The bonus is = " +b);
        System.err.println(" ");
    }
}