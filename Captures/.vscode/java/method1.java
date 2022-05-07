import java.util.Scanner;

public class method1 {
    static void product(int n){
        int i=1;
        for(i=1;i<=10;i++)
        {
            System.out.printf(" %d X %d = %d",n,i,n*i);

        }
    }
    public static void main(String[] args) {
        System.out.println("ENTER THE NUMBER");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        product(n);
    }
    
}
