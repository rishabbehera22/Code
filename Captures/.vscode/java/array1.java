import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float []a=new float[5];
        System.out.println("enter the numbers");
        int i=0;
        float sum=0.0f;
        for(i=0;i<4;i++)
        {
             a[i]= sc.nextFloat();
        }
        for(i=0;i<4;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("the sum is :");
        System.out.println(sum);


    }
    
}
