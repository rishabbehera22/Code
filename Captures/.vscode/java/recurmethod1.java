import java.util.Scanner;

public class recurmethod1 {
    static int sum(int n){
        if(n==1)
        {
            return 1;
        }
        else
        {
            return n+sum(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("ENTER THE NUMBER");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sum(n));    
    }
}

