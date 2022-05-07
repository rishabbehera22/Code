import java.util.Scanner;
public class areashapes {
    public static void main(String[] args) {
        
    }
}
interface data{
    int height;
    int breadth;
    void getdata();

    void putdata();
}
class Rectangle implements  data{
    void getdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height");
        height=sc.nextInt();
        System.out.println("Enter breadth");
        breadth=sc.nextInt();
    }
    void putdata(){
        System.out.println("The height is=" + height);
        System.out.println("The breadth is=" + breadth);
    }
}
