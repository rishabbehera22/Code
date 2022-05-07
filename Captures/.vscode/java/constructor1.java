import java.util.Scanner;
import java.lang.Math;
public class constructor1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        point p1=new point(4,3);
        point p2=new point(6,5);
        p1.show();
        p2.show();
        p1.findDistance();
        p1.findDistance(6, 5);
        p2.findDistance(p2);
    }
}

class point
{
    int x;
    int y;
    point()
    {
        x=0;
        y=0;
    }
    point(int x1,int y1)
    {
        x=x1;
        y=y1;
    }
    point(point p)
    {
        x=p.x;
        y=p.y;
    }
    void findDistance()
    {
        float q=(x*x)+(y*y);
        float distance=(float) Math.sqrt(q);
        System.out.println("the distance is:");
        System.out.println(distance);
    }
    void findDistance(int x1,int y1)
    {
        float q=(x1*x1)+(y1*y1);
        float distance=(float) Math.sqrt(q);
        System.out.println("the distance is:");
        System.out.println(distance);
    }
    void findDistance(point p1)
    {
        float q=(float)(Math.pow(x-p1.x,2)+Math.pow(y-p1.y, 2));
        float distance=(float) Math.sqrt(q);
        System.out.println("the distance is:");
        System.out.println(distance);
    }
    void show(){
        System.out.println("X is: ");
        System.out.println(x);
        System.out.println("Y is :");
        System.out.println(y);
    }
}

