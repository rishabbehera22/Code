import java.util.Scanner;

public class method2 {
    static void pattern(int n){
        int i=1;
        for(i=1;i<=n;i++)
        {
            System.out.print("*");

        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int j=1;
        for(j=1;j<=5;j++){
        pattern(j);
        }
    }
    
}
