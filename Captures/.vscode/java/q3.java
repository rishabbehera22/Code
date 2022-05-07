import java.util.Scanner;

import javax.sql.rowset.serial.SQLOutputImpl;

public class q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the marks of 5 subjects");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        float s=a+b+c+d+e;
        float avg=(s*100)/500;
        System.out.println("THE PERCENTAGE IS");
        System.out.println(avg);
    }
}
