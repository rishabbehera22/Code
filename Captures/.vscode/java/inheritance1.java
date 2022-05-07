import java.util.Scanner;
public class inheritance1 {
    public static void main(String[] args) {
        cylinder c=new cylinder();
        c.setradius(4);
        c.sethieght(6);
        float carea=(2*(c.retrunarea()))+(c.returnvolume());
        System.out.println("The area is:");
        System.out.println(carea);
    }
}
class circle{
    int radius;
    void setradius(int r)
    {
        radius=r;
    }
    float retrunarea()
    {
        float area=3.14f*radius*radius;
        return area;
    }
}
class cylinder extends circle{
    int hieght;
    void sethieght(int h)
    {
        hieght=h;
    }
    float returnvolume()
    {
        float area=3.14f*radius*radius*hieght;
        return area;
    }
}