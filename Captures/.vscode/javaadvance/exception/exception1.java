import java.util.Scanner;

public class exception1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(b==0)
        {
            throw new ArithmeticException("hahaha");
        }
        else
        {
            System.out.println(a/b);
        }
    }
}
