import java.util.Scanner;

public class oop2 {
    public static void main(String[] args) {
        square s=new square();
        s.a=4;
        System.out.println(s.area());
        System.out.println(s.perimeter());
    }
    
}
class square{
    int a;
    int area(){
        return (a*a);
    }
    int perimeter(){
        return (4*a);
    }
    
}