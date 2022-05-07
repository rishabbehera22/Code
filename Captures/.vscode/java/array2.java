import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []a=new int[5];
        int i=0;
        System.out.println("enter the number to be searched");
        int n=sc.nextInt();
        for(i=0;i<=4;i++)
        {
            System.out.println("enter the numbers");
            a[i]=sc.nextInt();
        }
        for(i=0;i<=4;i++)
        {
            if(a[i]==n)
            {
                System.out.println("Number is found at position:");
                System.out.println(i);
            }
        }
    }
}

