import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class recurmethod2 {
    static int fib(int n){
        int a=0;
        int b=1;
        if(n==1)
        {
            return 0;
        }
        else if(n==2)
        {
            return 1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }
    public static void main(String[] args) {
        System.out.println("ENTER THE NUMBER");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fib(n));    
    }
}