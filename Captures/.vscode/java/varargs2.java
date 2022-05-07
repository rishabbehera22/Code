import java.util.Scanner;

public class varargs2 {
    static void sum(int ...arr)
    {
        int s=0;
        int i=0;
        for(int a: arr)
        {
            s=s+a;
            i=i+1;
        }
        System.out.println("the sum is " + (s/i));
    }
    public static void main(String[] args) {
        sum(3,7);
        sum(4,7,8);
        sum(5,6,7,8);
    }
}

