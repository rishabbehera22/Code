public class static5 {
    public static void main(String[] args) {
        area a=new area(4, 5);
        area b=new area(2);
    }
    
}
class area{
    area(int radius)
    {
        float area=(float) (3.14*radius*radius);
        System.out.println("area of circle:");
        System.out.println(area);
    }
    area(int length,int breath)
    {
        int area=length*breath;
        System.out.println("area of rectangle");
        System.out.println(area);
    }
}