import java.util.Scanner;

public class constructor3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cylinder p1=new cylinder();
        p1.set(3, 5);
        System.out.println("the hieght of cyliner is" +p1.returnhieght());
        System.out.println("the radius of cyliner is" +p1.returnradius());
        System.out.println("the volume is "+p1.volume());
        System.out.println("the surface area is"+p1.surfacearea());
    }
}
class cylinder
{
    int radius;
    int hieght;
    void set(int r,int h){
        radius=r;
        hieght=h;
    }
    int returnhieght()
    {
        return hieght;
    }
    int returnradius()
    {
        return radius;
    }
    float volume()
    {
        float volume=(float) (3.14*((radius*radius*hieght)));
        return volume;
    }
    float surfacearea()
    {
        float surfacearea=(float) ((2*3.14*radius*hieght)+(2*3.14*radius*radius));
        return surfacearea;
    }
}
