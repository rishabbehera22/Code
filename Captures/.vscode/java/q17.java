import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class q17 {
     public static void main(String[] args) {
        System.out.println("ENTER THE income");
        Scanner sc = new Scanner(System.in);
        int income=sc.nextInt();
        float amount=0;
        if(income>=250000 && income<=500000 )
        {
            amount=income+((income*5.0f)/100.f);
        }
        else if (income>=500000 && income<=1000000) {
            amount=income+((income*20.0f)/100.f);
        }
        else if(income>1000000)
        {
            amount=income+((income*30.0f)/100.f);
        }
        else 
        {
            System.out.println("there will be no tax");
        }
        System.out.println("the amount is :");
        System.out.println(amount);
    }
}