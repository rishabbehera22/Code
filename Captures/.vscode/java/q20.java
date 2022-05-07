import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class q20 {
     public static void main(String[] args) {
        System.out.println("ENTER THE NUMBER");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int sum=0;
        while (i<=n) {
            if(i%2==0)
            {
                sum=sum+i;
                i=i+1;
            }
            i=i+1;
        }
        System.out.println("the sum is :");
        System.out.println(sum);
    } 
}
