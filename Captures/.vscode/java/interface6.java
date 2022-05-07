public class interface6 {
    public static void main(String[] args) {
        student s=new student();
        s.math3();
    }
}
interface A{
    void math1();
    void math2();
}
interface B extends A{
    void math3();
}
class student implements B{
    public void math3()
    {
        System.out.println("Math3");
    }
}