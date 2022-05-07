public class interface5 {
    public static void main(String[] args) {
        student s=new student();
        s.disp();
        s.nonlfacemethod();
        Inter1 i=new student();
        i.disp();
        i.nonlfacemethod();
    }
}
interface Inter1{
    void disp();

}
class student implements Inter1{
    public void disp()
    {
        System.out.println(" i am the student");
    }
    void nonlfacemethod()
    {
        System.out.println("Nonlface");
    }
}
