import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age");
        int age=sc.nextInt();
        switch (age) {
            case 18:
                System.out.println("you are a adult");
                break;
            case 23:
            System.out.println("you can join the job");
            break;
            case 60:
            System.out.println("retirment");
            break;
        
            default:
            System.out.println("wrong choice");
                break;
        }
    }
        
}