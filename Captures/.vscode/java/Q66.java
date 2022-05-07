public class Q66 extends shape implements Inter_1
{
    public void disp()
    {
        System.out.println("The display function of interface ");
    }
    public static void main(String[] args) 
    {
        Q66 obj=new Q66();
        obj.disp();
        obj.display();
    }
}
interface Inter_1
{
    void disp();
}
class shape
{
    void display()
    {
        System.out.println("The display function of shape class ");
    }
}
