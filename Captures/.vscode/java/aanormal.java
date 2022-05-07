import javax.xml.crypto.Data;

public class aanormal {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.getdata(5, 6);
        r.putdata();
        r.arearectangle();
        r.perimeterrectangle();
        triangle t=new triangle();
        t.getdata(3, 4);
        t.putdata();
        t.areatriangle();
        t.perimetertrinagle();
    }
}
class Data5{
    int height;
    int breadth;
    void getdata(int h,int b){
        height=h;
        breadth=b;
    }
    void putdata()
    {
        System.out.println("The height is =" +height);
        System.out.println("The breadth is =" +breadth);
    }
}
class Rectangle extends Data5{
    void arearectangle()
    {
        int area;
        area=height*breadth;
        System.out.println("Area of Rectang=" +area);
    }
    void perimeterrectangle()
    {
        int peri=2*(height+breadth);
        System.out.println("the perimeter is =" +peri);
    }
}
class triangle extends Data5{
    void areatriangle(){
        float area;
        area=(float)(0.5*height*breadth);
        System.out.println("Area of Triangle=" +area);
    }
    void perimetertrinagle(){
        int hyp=(int)Math.sqrt(Math.pow(height,2)+Math.pow(breadth,2));
        System.out.println("The perimeter of triangle is : "+(height+breadth+hyp));
    }
    }


