import java.util.Scanner;
public class inheritance2 {
    public static void main(String[] args) {
        cuboid c=new cuboid();
        c.setlength(4);
        c.setbreath(5);
        c.sethieght(6);
        float carea=(2*(c.retrunarea()))+(c.returnvolume());
        System.out.println("The area of square is:");
        System.out.println(c.retrunarea());
        System.out.println("The volume of cubiod is:");
        System.out.println(c.returnvolume());
    }
}
class rectangle{
    int length,breath;
    void setlength(int l)
    {
        length=l;
    }
    void setbreath(int b)
    {
        breath=b;
    }
    float retrunarea()
    {
        int area=length*breath;
        return area;
    }
}
class cuboid extends rectangle{
    int hieght;
    void sethieght(int h)
    {
        hieght=h;
    }
    float returnvolume()
    {
        int volume=length*breath*hieght;
        return volume;
    }
}
