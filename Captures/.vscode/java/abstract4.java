public class abstract4 {
    public static void main(String[] args) {
        circle c=new circle();
        c.assignc(3);
        c.calculatearea();
        triangle t=new triangle();
        t.assignc(3, 4);
        t.calculatearea();
        square s=new square();
        s.assignc(5, 6);
        s.calculatearea();
    }
}
abstract class shape{
    abstract public void calculatearea();
}
class circle extends shape{
    int radius;
    void assignc(int r)
    {
        radius=r;
    }
    public void calculatearea()
    {
        float area=(float) (3.14*radius*radius);
        
        System.out.println(area);
    }

}
class triangle extends shape{
    int length;
    int breath;
    void assignc(int l,int b)
    {
        length=l;
        breath=b;
    }
    public void calculatearea()
    {
        float area=(float) (0.5*length*breath);
        System.out.println(area);
    }
    
}
class square extends shape{
    int length;
    int breath;
    void assignc(int l,int b)
    {
        length=l;
        breath=b;
    }
    public void calculatearea()
    {
        int area=length*breath;
        System.out.println(area);
    }
    
}