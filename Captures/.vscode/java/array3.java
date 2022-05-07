import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of students");
        int n;
        int i;
        int sum=0;
        n=sc.nextInt();
        int []marks=new int[n];
        for(i=0;i<=4;i++)
        {
            System.out.println("enter the marks");
            marks[i]=sc.nextInt();
        }
        for(i=0;i<=4;i++)
        {
            sum=sum+marks[i];
        }
        int avg=sum/n;
        System.out.println("the average is");
        System.out.println(avg);
    }
}