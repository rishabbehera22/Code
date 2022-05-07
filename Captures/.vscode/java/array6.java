import java.util.Scanner;

public class array6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row");
        int i=sc.nextInt();
        System.out.println("enter the coloum");
        int j=sc.nextInt();
        int [][]a=new int[i][j];
        int q,b;
        for(q=0;q<i;q++)
        {
            for(b=0;b<j;b++)
            {
                a[q][b]=sc.nextInt();
            }
        }
        for(q=0;q<i;q++)
        {
            for(b=0;b<j;b++)
            {
                System.out.print(a[q][b]+" ");
            }
            System.out.println(" ");
        }

    }
    
}
