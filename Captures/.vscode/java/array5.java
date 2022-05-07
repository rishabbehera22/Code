import java.util.Scanner;

public class array5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []a=new int[5];
        int []b=new int[5];
        int i=0;
        for(i=0;i<=4;i++)
        {
            System.out.println("enter the numbers");
            a[i]=sc.nextInt();
        }
        int s=0;
        for(i=4;i>=0;i--)
        {
           b[s]=a[i];
           s=s+1;
        }
        for(i=0;i<=4;i++)
        {
            System.out.println(b[i]);
        }
    }
}
