import java.util.Scanner;

public class q16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three subject marks");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        float p=((a+b+c)/300.0f)*100.0f;
        System.out.println(p);
        if(a>=33 && b>=33 && c>=33)
        {
            if(p>=40)
            {
                System.out.println("Passed");
            }
            else
            {
                System.out.println("not passed");
            }
        }
        else
        {
            System.out.println("not passed");
        }
    }
}
