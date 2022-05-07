public class static6 {
    public static void main(String[] args) {
        calculation a=new calculation();
        a.area(3, 4);
        a.area(4);
        a.area(4, 5, 6);
    }
}
class calculation
{
     void area(int radius)
    {
        float area=(float) (3.14*radius*radius);
        System.out.println("area of circle:");
        System.out.println(area);
    }
    void area(int length,int breath)
    {
        int area=length*breath;
        System.out.println("area of rectangle");
        System.out.println(area);
    }
    void area(int length,int breath,int height)
    {
        int volume=length*breath*height;
        System.out.println("volume of cube");
        System.out.println(volume);
    }
}