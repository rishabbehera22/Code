public class interface4 {
public static void main(String[] args) {
    
}
}
interface inter
{
    int x=900;
    void disp();
}
class student implements inter{
    public void disp()
    {
        System.out.println("The value of x is" +x);
    }
    void change()
    {
        x=22000;
    }
}
