import java.util.Scanner;

class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        float n=sc.nextFloat();
        circle c=new circle();
        c.setDim(n);
        c.findArea();
        c.findPerimeter();
    }
}

class circle {
    float radius;
     void setDim(float r)
    {
        radius=r;
    }
    void findArea()
    {
        float area=3.14f*radius*radius;
        System.out.println(area);
    }
    void findPerimeter()
    {
        float perimeter=2.0f*3.14f*radius;
        System.out.println(perimeter);
    }
}

