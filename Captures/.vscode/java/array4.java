import java.util.Scanner;

public class array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]a=new int[2][3];
        int [][]b=new int[2][3];
        int i=0,j=0;
        System.out.println("enter the first array");
        for(i=0;i<=1;i++)
        {
            for(j=0;j<=2;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the second array");
        for(i=0;i<=1;i++)
        {
            for(j=0;j<=2;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        int [][]sum=new int[2][3];
        for(i=0;i<=1;i++)
        {
            for(j=0;j<=2;j++)
            {
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        for(i=0;i<=1;i++)
        {
            for(j=0;j<=2;j++)
            {
                System.out.print(sum[i][j]);
            }
            System.out.println(" ");
        }
    }
}


