import java.util.Scanner;

public class try5 {
    public static void main(String[] args) {
        String s=null;
        try {
            int b=s.length();
            System.out.println(b);
        } catch (NullPointerException e) {
            System.out.println("The string entered is null");
        }
    }
}
