import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        String letter="Dear <|name|>, Trans a lot";
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println(letter.replace("<|name|>", name));
    }
        
    }
