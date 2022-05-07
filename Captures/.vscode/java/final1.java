import java.util.Scanner;

public class final1 {
    public static void main(String[] args) {
        final int B=1;
        System.out.println("The value of B IS" +B);
        B=3;
        System.out.println("The value of B IS" +B);
    }
}
class circle{
    final void area(){
        System.out.println(5*5);
    }
}
final class rectangle{
    void area(){
        System.out.println(5*5);
    }
}
class shape extends circle{
    void area(){
        System.out.println(6*5);
    }
}
class colour extends rectangle{
    void area(){
        System.out.println(6*5);
    }
}