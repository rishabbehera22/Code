import java.util.Scanner;
public class try7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        if(b<0)
        {
            throw new ArithmeticException("ERROR AND EXITING");
        }
        else{
            double c = (double)b;
            System.out.println("The double value is ="+c);
        }
    }
}
class Myexception extends Exception{
    public void ArithmeticException(String s)
    {
        System.out.println(s);
    }
}