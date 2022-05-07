public class abstract5 {
    public static void main(String[] args) {
        shape s=new circle();
        s.r=5;
        s.print();
    }
}
abstract class shape{
    int r;
    abstract public void print();
}
class circle extends shape
{
    public void print(){
        System.out.println("The radius is =" +r);
    }
}
