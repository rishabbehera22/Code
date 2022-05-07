import java.util.Scanner;

public class interface3 {
    public static void main(String[] args) {
       washing_machine w=new washing_machine();
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter capacity");
       int c=sc.nextInt();
       w.setcheck(c);
       w.run();
       w.consume();
    }
}
interface motor
{
    int capacity=9000;
    void run();
    void consume();
}
 class washing_machine implements motor
{
    void setcheck(int c)
    {
        System.out.println("setcheck function");
        if(capacity==c)
        {
            System.out.println("checked");
        }
        else
        {
            System.out.println("not checked");
        }
        System.out.println(" ");
    }
    public void run()
    {
        System.out.println("Implementing run function");
        System.out.println("it is running");
        System.out.println(" ");
    }
    public void consume()
    {
        System.out.println("Implementing consume function");
        System.out.println("Its capacity  is " +capacity);
    }
}