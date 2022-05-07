import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class q21 {
     public static void main(String[] args) {
        System.out.println("ENTER THE NUMBER");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        for(i=1;i<=10;i++)
        {
            System.out.printf(" %d X %d = %d",n,i,n*i);

        }
    }
}
