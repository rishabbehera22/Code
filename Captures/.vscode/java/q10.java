import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
import javax.sql.rowset.serial.SQLOutputImpl;

public class q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter roll number");
        int roll=sc.nextInt();
        System.out.println("enter name");
        String name=sc.next();
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
        System.out.println("roll number is :");
        System.out.println(roll);
        System.out.println("name is");
        System.out.println(name);
        if(avg>=90)
        {
            System.out.println("grade is A");
        }
        else if(avg>=80 && avg<=90)
        {
            System.out.println("Grade is B");
        }
        else 
        {
            System.out.println("Grade is C");
        }

    }
}
