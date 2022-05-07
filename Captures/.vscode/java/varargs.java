import java.util.Scanner;

public class varargs {
    static void sum(int ...arr)
    {
        int s=0;
        for(int a: arr)
        {
            s=s+a;
        }
        System.out.println("the sum is " + s);
    }
    public static void main(String[] args) {
        sum(3,7);
        sum(4,7,8);
        sum(5,6,7,8);
    }
}
