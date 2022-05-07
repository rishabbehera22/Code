import java.util.Scanner;

public class q9 {
     public static void main(String[] args) {
        System.out.println("ENTER THE TOTAL NUMBER TO BE INPUTED");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int evens=0;
        int odds=0;
        int sum=0;
        int i;
        for(i=0;i<n;i++)
        {
            int q=sc.nextInt();
            sum=sum+q;
            if(q%2==0)
            {
                evens=evens+q;
            }
            else
            {
                odds=odds+q;
            }

        }
        System.out.println("The sum is:");
        System.out.println(sum);
        System.out.println("the sum of even number is:");
        System.out.println(evens);
        System.out.println("The sum of odd number is");
        System.out.println(odds);

     
        
    }
    
}
