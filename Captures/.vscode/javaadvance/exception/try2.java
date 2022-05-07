import java.util.Scanner;

public class try2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        try{
            int a=26/b;
            System.out.println(a);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Dividing number by 0 not possible");
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Illegal argument");
        }
    }
}
